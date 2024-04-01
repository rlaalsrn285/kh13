<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>회원 등급별 인원수</h1>

<table border="1" width="300">
	<thead>
		<tr>
			<th>회원 등급</th>
			<td>인원수</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="statVO" items="${list}">
		<tr>
			<td>${statVO.title}</td>
			<td>${statVO.count}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>