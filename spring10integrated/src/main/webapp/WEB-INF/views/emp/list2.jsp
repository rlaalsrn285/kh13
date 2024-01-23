<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="vv" uri="http://java.sun.com/jsp/jstl/core" %>

	<div>
	<a href="emp/list">사원시스템</a>
	<a href="menu/list">메뉴시스템</a>
	<a href="/emp/list">사원시스템</a>
	<a href="/menu/list">메뉴시스템</a>
	</div>
	
	<div>


    <h1> emp 목록 테스</h1>
    
    <form action="list" method="get">
    	<select name="ccc" >
    		<option value="emp_name">사원이름</option>
    		<option value="emp_dept">사원부서</option>
    	</select>
    <input type="search" name="keykey" value="${param.keykey}">
    <button> 검색검색검</button>
    </form>
    
    <table border="10">
    	<thead>
    	<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>부서명</th>
			<th>입사일</th>
			<th>급여액</th>
		</tr>
    	</thead>
    	<tbody align="center">
    	<vv:forEach var="qqq" items="${lllist}">
		<tr>
			<td>${qqq.empNo}</td>
			<td>${qqq.empName}</td>
			<td>${qqq.empDept}</td>
			<td>${qqq.empDate}</td>
			<td>${qqq.empSal}원</td>
		</tr>
		</vv:forEach>
    	</tbody>
    </table>
    
    </div>
	
	<div>
	<h1> 하단영역</h1>
	<h1> ㅁㄴㅇㄻㄴㅇㄹ</h1>
	</div>
   