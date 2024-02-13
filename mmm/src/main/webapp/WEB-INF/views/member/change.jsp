<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="change" method="post" autocomplete="off">

<div class="container w-500">
	<div class="cell center"><h1>개인정보 변경</h1></div>
	<div class="cell">
		<label>닉네임<b style="color:red">*</b></label>
		<input type="text" name="memberNick" placeholder="한글숫자 2~10자" required class="tool w-100" value="${memberDto.memberNick}">
	</div>
	<div class="cell">
		<label>이메일<b style="color:red">*</b></label>
		<input type="email" name="memberEmail" required class="tool w-100" value="${memberDto.memberEmail}">
	</div>
	<div class="cell">
		<label>생년월일</label>
		<input type="date" name="memberBirth" class="tool w-100" value="${memberDto.memberBirth}">
	</div>
	<div class="cell">
		<label>휴대전화</label>
		<input type="tel" name="memberContact" class="tool w-100" value="${memberDto.memberContact}">
	</div>
	<div class="cell">
		<label>주소</label>
	</div>
	<div class="cell">
		<input type="text" name="memberPost" placeholder="우편번호" class="tool" size="8" value="${memberDto.memberPost}">
		<button class="btn">검색</button>
	</div>
	<div class="cell">
		<input type="text" name="memberAddress1" placeholder="기본주소" class="tool w-100" value="${memberDto.memberAddress1}">
	</div>
	<div class="cell">
		<input type="text" name="memberAddress2" placeholder="상세주소" class="tool w-100" value="${memberDto.memberAddress2}">
	</div>
	<div class="cell mt-20">
		<label>비밀번호 확인<b style="color:red">*</b></label>
		<input type="password" name="memberPw" required class="tool w-100">
	</div>
	<div class="cell">
		<button class="btn positive w-100">변경하기</button>
	</div>
	
	<c:if test="${param.error != null}">
	<div class="cell center">
		<h3 style="color:red">비밀번호가 일치하지 않습니다</h3>
	</div>
	</c:if>
</div>

</form>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>








