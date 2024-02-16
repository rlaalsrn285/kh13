<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%--
	생성해야 하는 주소 형태
	http://localhost:8080/pocketmon/insert2
	?pocketmonNo=1&pocketmonName=피카츄&pocketmonType=전기

	폼(절대경로)
	<form action="/pocketmon/insert2">
	
	폼(상대경로)
	<form action="insert2">
--%>

<form action="insert2" autocomplete="off">
<div class="container w-400">
	<div class="cell center">
		<h1>포켓몬스터 등록</h1>
	</div>
	<div class="cell">
		<label>번호</label>
		<input name="pocketmonNo" class="tool w-100">
	</div>
	<div class="cell">
		<label>이름</label>
		<input name="pocketmonName" class="tool w-100">
	</div>
	<div class="cell">
		<label>속성</label>
		<input name="pocketmonType" class="tool w-100">
	</div>
	<div class="cell">
		<button class="btn positive w-100">등록</button>
	</div>
</div>
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>