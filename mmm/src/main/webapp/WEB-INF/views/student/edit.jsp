<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="edit" method="post" autocomplete="off">
<input type="hidden" name="studentId" value="${studentDto.studentId}">

<div class="container w-400">
	<div class="cell center"><h1>학생 정보 수정</h1></div>
	<div class="cell">
		<label>이름</label>
		<input type="text" name="name" required value="${studentDto.name}" class="tool w-100">
	</div>
	<div class="cell">
		<label>국어</label>
		<input type="number" name="koreanScore" required min="0" max="100" value="${studentDto.koreanScore}" class="tool w-100 right">
	</div>
	<div class="cell">
		<label>영어</label>
		<input type="number" name="englishScore" required min="0" max="100" value="${studentDto.englishScore}" class="tool w-100 right">
	</div>
	<div class="cell">
		<label>수학</label>
		<input type="number" name="mathScore" required min="0" max="100" value="${studentDto.mathScore}" class="tool w-100 right">
	</div>
	<div class="cell">
		<button class="btn positive w-100">수정</button>
	</div>
</div>
	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>