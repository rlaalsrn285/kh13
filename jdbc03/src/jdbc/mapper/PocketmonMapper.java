package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.PocketmonDto;

public class PocketmonMapper implements RowMapper<PocketmonDto>{

	@Override
	public PocketmonDto mapRow(ResultSet rs, int idx) throws SQLException {

		PocketmonDto dto = new PocketmonDto();//비어있는 객체 생성
		dto.setPocketmonNo(rs.getInt("pocketmon_no"));
		dto.setPocketmonName(rs.getString("pocketmon_name"));
		dto.setPocketmonType(rs.getString("pocketmon_type"));
		return dto;
	}

}