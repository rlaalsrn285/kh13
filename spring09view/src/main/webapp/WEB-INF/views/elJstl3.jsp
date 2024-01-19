<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  
  <h1> EL에서 파라미터 읽기테스트</h1>
  
  <form action="test03" method="get">
  
	<input type="search" name="query" value="${param.query }" >
	<button> 검검색색</button>  
  
  </form>