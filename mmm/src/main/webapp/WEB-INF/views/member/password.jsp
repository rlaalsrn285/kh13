<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="password" method="post">

<div class="container w-500">
	<div class="cell center"><h1>비밀번호 변경</h1></div>
	<div class="cell">
		<label>기존 비밀번호</label>
		<input type="password" name="originPw" class="tool w-100">
	</div>
	<div class="cell">
		<label>변경 비밀번호</label>
		<input type="password" name="changePw" class="tool w-100">
	</div>
	<div class="cell">
		<button class="btn negative w-100">비밀번호를 변경하겠습니다</button>
	</div>
	<c:if test="${param.error != null}">
	<div class="cell">
		<h3 style="color:red">기존 비밀번호가 일치하지 않습니다</h3>
	</div>
	</c:if>
</div>
	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>