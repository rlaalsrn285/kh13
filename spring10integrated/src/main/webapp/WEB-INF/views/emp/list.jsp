<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="vv" uri="http://java.sun.com/jsp/jstl/core" %>

	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    <h1> emp 목록 테스</h1>
    
    <form action="list" method="get">
    	<select name="ccc" >
    	
    
    	
    		<option value="emp_name">사원이름</option>
    		<option value="emp_dept">사원부서</option>
    	</select>
    <input type="search" name="keykey" value="${param.keykey}">
    <button> 검색검색검</button>
    
    
    </form>
    
    
    
    <vv:forEach var="ppp" items="${lllist}">
    
    	<h2>  번호:${ppp.empNo}&nbsp;&nbsp; 이름:${ppp.empName}&nbsp;&nbsp; 부서:${ppp.empDept}  </h2>
    
    </vv:forEach>
    
    </div>
	
	<div>
	<h1> 하단영역</h1>
	<h1> ㅁㄴㅇㄻㄴㅇㄹ</h1>
	</div>