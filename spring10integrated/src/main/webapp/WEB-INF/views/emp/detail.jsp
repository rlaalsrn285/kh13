<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>사원 상세 정보</h1>

<table border="1" width="300">
	<tbody>
		<tr>
			<th width="35%">사원번호</th>
			<td>${dto.empNo}</td>
		</tr>
		<tr>
			<th>사원이름</th>
			<td>${dto.empName}</td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td>${dto.empDept}</td>
		</tr>
		<tr>
			<th>입사일</th>
			<td>${dto.empDate}</td>
		</tr>
		<tr>
			<th>급여액</th>
			<td>
				<fmt:formatNumber value="${dto.empSal}" pattern="#,##0"></fmt:formatNumber>
				원
			</td>
		</tr>
	</tbody>
</table>

<h2><a href="list">목록보기</a></h2>
<h2><a href="insert">신규등록</a></h2>
<h2><a href="edit?empNo=${dto.empNo}">정보변경</a></h2>
<h2><a href="delete?empNo=${dto.empNo}">사원삭제</a></h2>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>




