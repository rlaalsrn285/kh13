package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.ItemDto;
import com.kh.spring10.mapper.ItemMapper;

@Repository
public class ItemDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ItemMapper itemMapper;
	
	public int getSequence() {
		String sql = "select item_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}
	public void insert(ItemDto itemDto) {
		String sql = "insert into item("
							+ "item_no, item_name, item_price, item_charge"
					+ ") values(?, ?, ?, ?)";
		Object[] data = {
			itemDto.getItemNo(), itemDto.getItemName(),
			itemDto.getItemPrice(), itemDto.getItemCharge()
		};
		jdbcTemplate.update(sql, data);
	}
	
	//연결
	public void connect(int itemNo, int attachNo) {
		String sql = "insert into item_attach(item_no, attach_no) values(?, ?)";
		Object[] data = {itemNo, attachNo};
		jdbcTemplate.update(sql, data);
	}
	public List<ItemDto> selectList() {
		String sql = "select * from item order by item_price asc";
		return jdbcTemplate.query(sql, itemMapper);
	}
	public int findAttachNo(int itemNo) {
		String sql = "select attach_no from item_attach where item_no = ?";
		Object[] data = {itemNo};
		return jdbcTemplate.queryForObject(sql, int.class, data);
	}
	
	public boolean delete(int itemNo) {
		String sql = "delete item where item_no = ?";
		Object[] data = {itemNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public ItemDto selectOne(int itemNo) {
		String sql = "select * from item where item_no = ?";
		Object[] data = {itemNo};
		List<ItemDto> list = jdbcTemplate.query(sql, itemMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	public boolean update(ItemDto itemDto) {
		String sql = "update item "
						+ "set item_name=?, item_price=?, item_charge=? "
						+ "where item_no=?";
		Object[] data = {
			itemDto.getItemName(), itemDto.getItemPrice(),
			itemDto.getItemCharge(), itemDto.getItemNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
}




