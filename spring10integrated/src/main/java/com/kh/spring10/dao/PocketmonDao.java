package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.PocketmonDto;
import com.kh.spring10.mapper.PocketmonMapper;
import com.kh.spring10.mapper.StatMapper;
import com.kh.spring10.vo.StatVO;

//DAO도 이제부터는 등록을 해야 한다
//- @Repository는 파일이나 데이터베이스와 같이 영속성 개체를 제어하는 도구
//- 등록된 도구끼리는 주세요(@Autowired)가 가능
@Repository
public class PocketmonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PocketmonMapper mapper;
	
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon("
							+ "pocketmon_no,"
							+ "pocketmon_name,"
							+ "pocketmon_type"
						+ ") values (?, ?, ?)";
		Object[] data = {
			dto.getPocketmonNo(), dto.getPocketmonName(), dto.getPocketmonType()
		};
		jdbcTemplate.update(sql, data);
	}
	
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon "
						+ "set pocketmon_name=?, pocketmon_type=? "
						+ "where pocketmon_no=?";
		Object[] data = {
			dto.getPocketmonName(), dto.getPocketmonType(),
			dto.getPocketmonNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}

	public boolean delete(int pocketmonNo) {
		String sql = "delete pocketmon where pocketmon_no=?";
		Object[] data = {pocketmonNo};
		return jdbcTemplate.update(sql, data) > 0;
	}

	public List<PocketmonDto> selectList() {
		String sql = "select * from pocketmon order by pocketmon_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public List<PocketmonDto> selectList(String column, String keyword) {
		String sql = "select * from pocketmon where instr("+column+", ?) > 0 "
										+ "order by "+column+" asc, pocketmon_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}

	public PocketmonDto selectOne(int pocketmonNo) {
		String sql = "select * from pocketmon where pocketmon_no = ?";
		Object[] data = {pocketmonNo};
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	@Autowired
	private StatMapper statMapper;
	
	//변종 메소드 - 포켓몬스터 개체수 통계
	public List<StatVO> statByType() {
		String sql = "select pocketmon_type 항목, count(*) 개수 "
						+ "from pocketmon group by pocketmon_type "
						+ "order by 개수 desc, pocketmon_type asc";
		return jdbcTemplate.query(sql, statMapper);
	}
}








