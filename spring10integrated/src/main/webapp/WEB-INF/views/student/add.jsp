<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="add" method="post" autocomplete="off">
<div class="container w-400">
	<div class="cell center"><h1>학생 정보 등록</h1></div>
	<div class="cell">
		<label>이름</label>
		<input type="text" name="name" required class="tool w-100">
	</div>
	<div class="cell">
		<label>국어</label>
		<input type="number" name="koreanScore" required min="0" max="100" class="tool w-100 right">
	</div>
	<div class="cell">
		<label>영어</label>
		<input type="number" name="englishScore" required min="0" max="100" class="tool w-100 right">
	</div>
	<div class="cell">
		<label>수학</label>
		<input type="number" name="mathScore" required min="0" max="100" class="tool w-100 right">
	</div>
	<div class="cell">
		<button class="btn positive w-100">등록</button>
	</div>
</div>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>