<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="change" method="post" autocomplete="off">
<input type="hidden" name="menuNo" value="${dto.menuNo}">

<div class="container w-400">
	<div class="cell center"><h1>메뉴 정보 수정</h1></div>
	<div class="cell">
		<label>메뉴명(한글)</label>
		<input type="text" name="menuNameKor" value="${dto.menuNameKor}" required class="tool w-100">
	</div>
	<div class="cell">
		<label>메뉴명(영문)</label>
		<input type="text" name="menuNameEng" value="${dto.menuNameEng}" required class="tool w-100">
	</div>
	<div class="cell">
		<label>메뉴유형</label>
		<input type="text" name="menuType" value="${dto.menuType}" required class="tool w-100">
	</div>
	<div class="cell">
		<label>메뉴가격</label>
		<input type="number" name="menuPrice" value="${dto.menuPrice}" required class="tool w-100 right">
	</div>
	<div class="cell right">
		<a href="list" class="btn">목록보기</a>
		<button class="btn positive">변경하기</button>
	</div>
</div>
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
