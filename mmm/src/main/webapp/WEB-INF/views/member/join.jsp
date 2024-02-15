<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="join" method="post" enctype="multipart/form-data" autocomplete="off">

<div class="container w-500">
	<div class="cell center"><h1>회원 정보 입력</h1></div>
	<div class="cell">
		<label>아이디<b style="color:red">*</b></label>
		<input type="text" name="memberId" placeholder="소문자 시작, 숫자 포함 8~20자" required class="tool w-100">
	</div>
	<div class="cell">
		<label>비밀번호<b style="color:red">*</b></label>
		<input type="password" name="memberPw" placeholder="대소문자,숫자,특수문자 포함 6~15자" required class="tool w-100">
	</div>	
	<div class="cell">
		<label>닉네임<b style="color:red">*</b></label>
		<input type="text" name="memberNick" placeholder="한글숫자 2~10자" required class="tool w-100">
	</div>
	<div class="cell">
		<label>이메일<b style="color:red">*</b></label>
		<input type="email" name="memberEmail" required class="tool w-100">
	</div>
	<div class="cell">
		<label>생년월일</label>
		<input type="date" name="memberBirth" class="tool w-100">
	</div>
	<div class="cell">
		<label>휴대전화</label>
		<input type="tel" name="memberContact" class="tool w-100">
	</div>
	<div class="cell">
		<label>주소</label>
	</div>
	<div class="cell">
		<input type="text" name="memberPost" placeholder="우편번호" class="tool" size="8">
		<button class="btn">검색</button>    
	</div>
	<div class="cell">
		<input type="text" name="memberAddress1" placeholder="기본주소" class="tool w-100">
	</div>
	<div class="cell">
		<input type="text" name="memberAddress2" placeholder="상세주소" class="tool w-100">
	</div>
	<div class="cell">
		<label>프로필 이미지</label>
		<input type="file" name="attach" class="tool w-100">
	</div>
	<div class="cell">
		<button class="btn positive w-100">회원가입</button>
	</div>
</div>

	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>