<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%-- 페이지 제목 --%>
<c:choose>
	<c:when test="${isSearch}">
		<h1>사원 검색</h1>
	</c:when>
	<c:otherwise>
		<h1>사원 목록</h1>
	</c:otherwise>
</c:choose>

<h2><a href="insert">신규 사원 등록</a></h2>

<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<%-- 
			EL은 문자열도 == 로 비교한다 (물론 equals도 가능)
			EL은 문자열을 쌍따옴표로 쓰건 외따옴표로 쓰건 상관하지 않는다
		 --%>
		<c:choose>
			<c:when test="${param.column == 'emp_name'}">
				<option value="emp_name" selected>사원명</option>
			</c:when>
			<c:otherwise>
				<option value="emp_name">사원명</option>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${param.column == 'emp_dept'}">
				<option value="emp_dept" selected>부서명</option>
			</c:when>
			<c:otherwise>
				<option value="emp_dept">부서명</option>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${param.column == 'emp_date'}">
				<option value="emp_date" selected>입사일</option>	
			</c:when>
			<c:otherwise>
				<option value="emp_date">입사일</option>
			</c:otherwise>
		</c:choose>
	</select>
	<input type="search" name="keyword" placeholder="검색어 입력" required
			value="${param.keyword}">
	<button>검색</button>
</form>

<%-- 목록 출력 --%>
<table border="1">
	<thead>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>부서명</th>
			<th>입사일</th>
<!-- 			<th>급여액</th> -->
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.empNo}</td>
			<td>
				<a href="detail?empNo=${dto.empNo}">${dto.empName}</a>
			</td>
			<td>${dto.empDept}</td>
			<td>${dto.empDate}</td>
<%-- 			<td>${dto.empSal}원</td> --%>
		</tr>
		</c:forEach>
	</tbody>
</table>


<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

