<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%-- 
	<select>를 사용하면 주어진 목록 중에서 선택시킬 수 있다
	<select name="...">
		<option value="...">...</option>
		<option value="...">...</option>
		<option value="...">...</option>
	</select>	 
--%>

<form action="insert" method="post" autocomplete="off">
<div class="container w-400">
	<div class="cell center"><h1>신규 메뉴 등록</h1></div>
	<div class="cell">
		<label>한글메뉴명</label>
		<input type="text" name="menuNameKor" required class="tool w-100">
	</div>
	<div class="cell">
		<label>영문메뉴명</label>
		<input type="text" name="menuNameEng" required class="tool w-100">
	</div>
	<div class="cell">
		<label>메뉴유형</label>
		<select name="menuType" required class="tool w-100">
			<option value="">선택하세요</option>
			<option value="커피">커피</option>
			<option value="스무디">스무디</option>
			<option value="에이드">에이드</option>
			<option value="디저트">디저트</option>
		</select>
	</div>
	<div class="cell">
		<label>메뉴가격</label>
		<input type="number" name="menuPrice" required class="tool w-100 right">
	</div>
	<div class="cell right">
		<a href="list" class="btn">목록 보기</a>
		<button class="btn positive">메뉴 등록</button>
	</div>
</div>





	
	
</form>


<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>




