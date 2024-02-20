<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>메뉴 상세 정보</h1>

<table border="1" width="400">
	<tr>
		<th width="35%">메뉴번호</th>
		<td>${dto.menuNo}</td>
	</tr>
	<tr>
		<th>메뉴이름(한글)</th> 
		<td>${dto.menuNameKor}</td>
	</tr>
	<tr>
		<th>메뉴이름(영문)</th>
		<td>${dto.menuNameEng}</td>
	</tr>	
	<tr>
		<th>메뉴유형</th>
		<td>${dto.menuType}</td>
	</tr>
	<tr>
		<th>메뉴가격</th>
		<td>
			<fmt:formatNumber value="${dto.menuPrice}" pattern="#,##0"/>원
		</td>
	</tr>
</table>

<h2><a href="list">목록으로</a></h2>
<h2><a href="insert">신규등록</a></h2>
<h2><a href="change?menuNo=${dto.menuNo}">정보수정</a></h2>
<h2><a href="delete?menuNo=${dto.menuNo}">메뉴삭제</a></h2>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

