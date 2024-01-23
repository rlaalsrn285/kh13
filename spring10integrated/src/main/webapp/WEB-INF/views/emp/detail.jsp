<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    	<div>
	<a href="emp/list">사원시스템</a>
	<a href="menu/list">메뉴시스템</a>
	<a href="/emp/list">사원시스템</a>
	<a href="/menu/list">메뉴시스템</a>
	</div>
	
	<div>
    
   <c:choose>
   	<c:when test="${empdtdto != null }">
   		<h1>사원(emp)정보</h1>
   			<table border="10" width="500" align="center">
   				<tr>
   					<th >사원번호</th>
   					<td align="center">${empdtdto.empNo}</td>
   				</tr>
   				
   				<tr>
   					<th>사원이름</th>
   					<td align="right">${empdtdto.empName}</td>
   				</tr>
   				
   				<tr>
   					<th>사원부서</th>
   					<td>${empdtdto.empDept}</td>
   				</tr>
   				
   				<tr>
   					<th>사원입사일</th>
   					<td align="center">${empdtdto.empDate}</td>
   				</tr>
   				
   				<tr>
   					<th>사원월급</th>
   					<td>${empdtdto.empSal}</td>
   				</tr>
   			</table>
   			<h1><a href="list">목록페이지 가기(완성)</a></h1>
   			<h1><a href="list">수정하기(미완성임 목록으로가짐)</a></h1>
   			<h1><a href="delete?emNNN=${empdtdto.empNo}">삭제하기(완성이지만 변수를내가뒤죽박죽만들어서 복붙은하지말것)</a></h1>
   	</c:when>
   	<c:otherwise>
   	<h1>없는 사원번호입니다</h1>
   	<h1><a href="list">목록페이지 가기(완성)</a>  </h1>
   	</c:otherwise>
   </c:choose>
   
   
   
   
   
   
   
   
   