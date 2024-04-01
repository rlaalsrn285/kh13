<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>충전 상품 목록</h1>

<h2><a href="add">신규등록</a></h2>

<table border="">
	<c:forEach var="itemDto" items="${list}">
	<tr>
		<td><img src="image?itemNo=${itemDto.itemNo}"></td>
		<td>${itemDto.itemName}</td>
		<td>${itemDto.itemPrice}원</td>
		<td>${itemDto.itemCharge}포인트 충전</td>
		<td>
			<a href="edit?itemNo=${itemDto.itemNo}">수정</a>
<%-- 			<a href="/admin/item/delete?itemNo=${itemDto.itemNo}">삭제</a> --%>
			<a href="delete?itemNo=${itemDto.itemNo}">삭제</a>
		</td>
	</tr>
	</c:forEach>
</table>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>