package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PoketmonMapper implements RowMapper<poketmonDto>{

	@Override
	public poketmonDto mapRow(ResultSet rs, int iddx) throws SQLException {
		poketmonDto dto = new poketmonDto();
		
		dto.setPoName(rs.getString("pocketmon_name"));
		dto.setPoNo(rs.getInt("pocketmon_no"));
		dto.setPoT(rs.getString("pocketmon_type"));
		return dto;
	}

}
