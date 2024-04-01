<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="findId" method="post" autocomplete="off">
<div class="container w-400">
	<div class="cell center">
		<h1>아이디 찾기</h1>
	</div>
	<div class="cell mt-0 flex-cell">
		<input type="text" name="memberNick" required class="tool w-100" placeholder="닉네임을 입력하세요">
		<button type="submit" class="btn positive"><i class="fa-solid fa-magnifying-glass"></i></button>
	</div>
	<div class="cell">
	</div>
</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>