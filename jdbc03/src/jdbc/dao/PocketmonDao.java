package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.PocketmonDto;
import jdbc.mapper.PocketmonMapper;
import jdbc.util.jdbcHelper;

public class PocketmonDao {

	public void insert(PocketmonDto dto) {

		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "insert into pocketmon("
						+ "pocketmon_no, pocketmon_name, pocketmon_type) "
						+ "values(?, ?, ?)";
		Object[] data = {
				dto.getPocketmonNo(), 
				dto.getPocketmonName(),
				dto.getPocketmonType()
		};
		jdbcTemplate.update(sql, data);
}

	public boolean update(PocketmonDto dto) {
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "update pocketmon "
				+ "set pocketmon_name=?,pocketmon_type=? "
				+ "where pocketmon_no=?";
		Object[] dataa = {
				dto.getPocketmonName(),
				dto.getPocketmonType(),
				dto.getPocketmonNo()
		};
		return jdbcTemplate.update(sql,dataa) > 0;
	}
	
	public boolean delete(int pocketmonNo) {
		JdbcTemplate jdbcTT = jdbcHelper.getJdbcTemplate();
		String sqll = "delete pocketmon where pocketmon_no=?";
		Object[] dataa = {pocketmonNo};
		
		return jdbcTT.update(sqll,dataa) > 0;
	}

	public List<PocketmonDto> selectList() {
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "select * from pocketmon order by pocketmon_no asc";
		PocketmonMapper mapper = new PocketmonMapper();
		return jdbcTemplate.query(sql, mapper);
	}

	public PocketmonDto selectOne(int pocketmonNo) {
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "select * from pocketmon where pocketmon_no = ?";
		Object[] data = {pocketmonNo};
		PocketmonMapper mapper = new PocketmonMapper();
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
}
}