package com.kh.spring11.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring11.dto.ItemDto2;

@Service
public class ItemMapper2 implements RowMapper<ItemDto2> {

	@Override
	public ItemDto2 mapRow(ResultSet rs, int idx) throws SQLException {
		ItemDto2 dto = new ItemDto2();
		dto.setItemNo(rs.getInt("item_no"));
		dto.setItemName(rs.getString("item_name"));
		dto.setItemPrice(rs.getInt("item_price"));
		dto.setItemRegist(rs.getDate("item_regist"));
		return dto;
	}
}
