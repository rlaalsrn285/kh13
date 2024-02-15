package com.kh.mmm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.mmm.dto.BuyDto;
import com.kh.mmm.mapper.BuyMapper;

@Repository
public class BuyDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BuyMapper buyMapper;

	//구매 내역 등록
	public void insert(BuyDto buyDto) {
		String sql = "insert into buy("
							+ "buy_serial, member_id, item_no, "
							+ "item_name, buy_qty, buy_total"
						+ ") "
						+ "values(buy_seq.nextval, ?, ?, ?, ?, ?)";
		Object[] data = {
			buyDto.getMemberId(), buyDto.getItemNo(), buyDto.getItemName(),
			buyDto.getBuyQty(), buyDto.getBuyTotal()
		};
		jdbcTemplate.update(sql, data);
	}
	
	//구매 내역 조회
	//[1] 자신(특정 회원)의 구매내역을 조회할 수 있는 기능
	public List<BuyDto> selectList(String memberId) {
		String sql = "select * from buy "
						+ "where member_id = ? "
						+ "order by buy_serial desc";
		Object[] data = {memberId};
		return jdbcTemplate.query(sql, buyMapper, data);
	}
	//[2] 상품별 구매내역을 조회할 수 있는 기능
	public List<BuyDto> selectList(int itemNo) {
		String sql = "select * from buy "
						+ "where item_no = ? "
						+ "order by buy_serial desc";
		Object[] data = {itemNo};
		return jdbcTemplate.query(sql, buyMapper, data);
	}
	//[3] 관리자가 모든 회원의 구매내역을 조회할 수 있는 기능
	public List<BuyDto> selectList() {
		String sql = "select * from buy order by buy_serial desc";
		return jdbcTemplate.query(sql, buyMapper);
	}

}
