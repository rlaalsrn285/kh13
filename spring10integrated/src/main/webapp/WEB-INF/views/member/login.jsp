<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="login" method="post" autocomplete="off">

<div class="row">
	<div class="col-lg-6 offset-lg-3 col-md-8 offset-md-2 col-sm-10 offset-sm-1">
	
		<!-- 제목 -->
		<div class="row">
			<div class="col">
				<div class="p-4">
					<h1 class="text-center">로그인</h1>
				</div>
			</div>
		</div>
		
		<!-- 아이디 입력창 -->
		<div class="row mt-4">
			<div class="col">
				<label>아이디</label>
				<input type="text" name="memberId" required class="form-control">
			</div>
		</div>
		
		<div class="row mt-4">
			<div class="col">
				<label>비밀번호</label>
				<input type="password" name="memberPw" required class="form-control">
			</div>
		</div>
		
		<div class="row mt-4">
			<div class="col">
				<button type="submit" class="btn btn-success w-100">로그인</button>
			</div>
		</div>
		
		<div class="row mt-4">
			<div class="col text-center">
				<a href="findId">아이디가 기억나지 않습니다</a>
			</div>
		</div>
		
		<div class="row mt-2">
			<div class="col text-center">
				<a href="findPw">비밀번호가 기억나지 않습니다</a>
			</div>
		</div>
		
		<c:if test="${param.error != null}">
		<div class="row mt-4">
			<div class="col">
				<h3 class="text-center text-danger">로그인 정보가 일치하지 않습니다</h3>
			</div>
		</div>
		</c:if>
	
	</div>
</div>
		
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


