package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.PocketmonDto;

@Repository
public class PocketmonDao {


	@Autowired
	private SqlSession sqlSession;
	
	public List<PocketmonDto> selectList(){
		
		return sqlSession.selectList("pocketmon.list");
	}
	
	public void insert(PocketmonDto dtodto) {
		
		sqlSession.insert("pocketmon.insert", dtodto);
	}
	
	public boolean update(PocketmonDto dtdto) {
		
		return sqlSession.update("pocketmon.edit", dtdto) > 0;
	}
	
	public boolean delete(int pocketmonNo) {
		return sqlSession.delete("pocketmon.remmm", pocketmonNo) > 0;
	}
	
	public PocketmonDto selectOne(int pocketmonNo) {
		
		List<PocketmonDto> list = sqlSession.selectList("pocketmon.findd" , pocketmonNo);
		return list.isEmpty() ? null : list.get(0);
	}
}
