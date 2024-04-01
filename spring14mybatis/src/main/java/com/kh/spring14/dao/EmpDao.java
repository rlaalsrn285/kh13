package com.kh.spring14.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.EmpDto;

@Repository
public class EmpDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	//등록
	public void insertt(EmpDto dtdt) {
		
		sqlSession.insert("emp.adad", dtdt);
	}
	
	//검색 리스트
	public List<EmpDto> selectList(){
		
		return sqlSession.selectList("emp.listAll");
	}
	
	//검색 단일
	public EmpDto selectOne(int empnn) {
		
		return sqlSession.selectOne("emp.findOne", empnn);
	}
	
	//검색 컬럼+값
	public List<EmpDto> selectList(Map<String, String> mapaa){
		
		return sqlSession.selectList("emp.selectByColumnAndValue" , mapaa);
	}
}
