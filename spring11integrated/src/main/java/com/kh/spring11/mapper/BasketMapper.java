package com.kh.spring11.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring11.dto.BasketDto;

@Service
public class BasketMapper implements RowMapper<BasketDto> {

	@Override
	public BasketDto mapRow(ResultSet rs, int idx) throws SQLException {

		BasketDto dto = new BasketDto();
		dto.setBasketNo(rs.getInt("basket_no"));
		dto.setBasketUser(rs.getString("basket_user"));
		dto.setBasketItem(rs.getInt("basket_item"));
		dto.setBasketTime(rs.getDate("basket_time"));
		dto.setBasketQty(rs.getInt("basket_qty"));
		return dto;
	}
}
