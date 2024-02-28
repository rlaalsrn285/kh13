package com.kh.mmm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.mmm.dto.BoardDto;
import com.kh.mmm.mapper.BoardListMapper;
import com.kh.mmm.mapper.BoardMapper;
import com.kh.mmm.vo.PageVO;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardMapper boardMapper;

	@Autowired
	private BoardListMapper boardListMapper;

	//목록
	public List<BoardDto> selectList() {
//		String sql = "select * from board order by board_no desc";
//		return jdbcTemplate.query(sql, boardMapper);
		
		String sql = "select "
							+ "board_no, board_title, board_writer, "
							+ "board_wtime, board_etime, board_readcount "
						+ "from board order by board_no desc";
		return jdbcTemplate.query(sql, boardListMapper);
	}
	//검색
	public List<BoardDto> selectList(String column, String keyword) {
//		String sql = "select * from board "
//						+ "where instr("+column+", ?) > 0 "
//						+ "order by board_no desc";
//		Object[] data = {keyword};
//		return jdbcTemplate.query(sql, boardMapper, data);
		
		String sql = "select "
							+ "board_no, board_title, board_writer, "
							+ "board_wtime, board_etime, board_readcount "
						+ "from board "
						+ "where instr("+column+", ?) > 0 "
						+ "order by board_no desc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, boardListMapper, data);
	}
	
	//목록+페이징
	//- page는 현재 조회할 페이지 번호
	//- size는 조회할 페이지의 출력개수
	//- 위 두개를 이용하여 시작행(beginRow)과 종료행(endRow)를 계산
	public List<BoardDto> selectListByPaging(int page, int size) {
		int endRow = page * size;
		int beginRow = endRow - (size-1);
		
		String sql = "select * from ("
							+ "select rownum rn, TMP.* from ("
								+ "select "
									+ "board_no, board_title, board_writer, "
									+ "board_wtime, board_etime, board_readcount "
								+ "from board order by board_no desc"
							+ ")TMP"
						+ ") where rn between ? and ?";
		Object[] data = {beginRow, endRow};
		return jdbcTemplate.query(sql, boardListMapper, data);
	}
	
	//검색+페이징
	public List<BoardDto> selectListByPaging(
			String column, String keyword, int page, int size){
		int endRow = page * size;
		int beginRow = endRow - (size-1);
		
		String sql = "select * from ("
							+ "select rownum rn, TMP.* from ("
								+ "select "
									+ "board_no, board_title, board_writer, "
									+ "board_wtime, board_etime, board_readcount "
								+ "from board "
								+ "where instr("+column+", ?) > 0 "
								+ "order by board_no desc"
							+ ")TMP"
						+ ") where rn between ? and ?";
		Object[] data = {keyword, beginRow, endRow};
		return jdbcTemplate.query(sql, boardListMapper, data);
	}
	
	//통합+페이징
	public List<BoardDto> selectListByPaging(PageVO pageVO){ 
		if(pageVO.isSearch()) {//검색
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select "
										+ "board_no, board_title, board_writer, "
										+ "board_wtime, board_etime, board_readcount, "
										+ "board_group, board_target, board_depth "
									+ "from board "
									+ "where instr("+pageVO.getColumn()+", ?) > 0 "
									//+ "order by board_no desc"//옛날방식(최신순)
									+ "connect by prior board_no=board_target "
									+ "start with board_target is null "
									+ "order siblings by board_group desc, board_no asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {
					pageVO.getKeyword(), 
					pageVO.getBeginRow(), 
					pageVO.getEndRow()
			};
			return jdbcTemplate.query(sql, boardListMapper, data);
		}
		else {//목록
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select "
										+ "board_no, board_title, board_writer, "
										+ "board_wtime, board_etime, board_readcount, "
										+ "board_group, board_target, board_depth "
									+ "from board "
									//+ "order by board_no desc"//옛날방식(최신순)
									+ "connect by prior board_no=board_target "
									+ "start with board_target is null "
									+ "order siblings by board_group desc, board_no asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {pageVO.getBeginRow(), pageVO.getEndRow()};
			return jdbcTemplate.query(sql, boardListMapper, data);
		}
	}
	
	//카운트 - 목록일 경우와 검색일 경우를 각각 구현
	public int count() {
		String sql = "select count(*) from board";
		return jdbcTemplate.queryForObject(sql, int.class);
	}
	public int count(String column, String keyword) {
		String sql = "select count(*) from board "
						+ "where instr("+column+", ?) > 0";
		Object[] data = {keyword};
		return jdbcTemplate.queryForObject(sql, int.class, data);
	}
	public int count(PageVO pageVO) {
		if(pageVO.isSearch()) {//검색
			String sql = "select count(*) from board "
							+ "where instr("+pageVO.getColumn()+", ?) > 0";
			Object[] data = {pageVO.getKeyword()};
			return jdbcTemplate.queryForObject(sql, int.class, data);
		}
		else {//목록
			String sql = "select count(*) from board";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
	}
	
	//단일조회
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, boardMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//조회수 증가
	public boolean updateBoardReadcount(int boardNo) {
		String sql = "update board "
						+ "set board_readcount = board_readcount + 1 "
						+ "where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//count, sequence, max, min, sum, avg처럼 결과가 하나만 나오는 경우
	//그 결과는 객체가 아니라 원시데이터 형태일 확률이 높다
	public int getSequence() {
		String sql = "select board_seq.nextval from dual";
		//jdbcTemplate.queryForObject(구문, 결과자료형);
		return jdbcTemplate.queryForObject(sql, int.class);
	}
	
	//등록할 때 시퀀스 번호를 생성하면 절대 안된다
	public void insert(BoardDto boardDto) {
		//String sql = "insert into board(7개) values(?, ?, ?, ?, sysdate, null, 0)";
		//String sql = "insert into board(4개) values(?, ?, ?, ?)";
		String sql = "insert into board("
						+ "board_no, board_title, board_content, board_writer, "
						+ "board_group, board_target, board_depth"
					+ ") values(?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
			boardDto.getBoardNo(), boardDto.getBoardTitle(),
			boardDto.getBoardContent(), boardDto.getBoardWriter(),
			boardDto.getBoardGroup(), boardDto.getBoardTarget(),
			boardDto.getBoardDepth()
		};
		jdbcTemplate.update(sql, data);
	}
	public boolean delete(int boardNo) {
		String sql = "delete board where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	public boolean update(BoardDto boardDto) {
		String sql = "update board "
						+ "set board_title=?, board_content=?, board_etime=sysdate "
						+ "where board_no = ?";
		Object[] data = {
			boardDto.getBoardTitle(), boardDto.getBoardContent(),
			boardDto.getBoardNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}

}
