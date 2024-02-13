package com.kh.mmm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.mmm.dto.BuyDto;

@Service
public class BuyMapper implements RowMapper<BuyDto>{
	@Override
	public BuyDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BuyDto buyDto = new BuyDto();
		buyDto.setBuySerial(rs.getInt("buy_serial"));
		buyDto.setMemberId(rs.getString("member_id"));
		buyDto.setItemNo(rs.getInt("item_no"));
		buyDto.setItemName(rs.getString("item_name"));
		buyDto.setBuyTime(rs.getDate("buy_time"));
		buyDto.setBuyQty(rs.getInt("buy_qty"));
		buyDto.setBuyTotal(rs.getInt("buy_total"));
		return buyDto;
	}
}
