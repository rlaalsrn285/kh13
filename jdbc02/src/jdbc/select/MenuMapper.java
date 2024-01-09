package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<MenuDto>{

	@Override
	public MenuDto mapRow(ResultSet rsrs, int idxx) throws SQLException {
		MenuDto asdd = new MenuDto();
		
		asdd.setMenuN(idxx);
		
		return null;
	}

}
