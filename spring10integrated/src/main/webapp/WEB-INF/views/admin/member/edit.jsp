<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%--
	추가로 전달할 정보 - 아이디(hidden)
	수정할 정보 - 닉네임,이메일,생년월일,연락처,주소,(+등급,포인트)	
 --%>
<form action="edit" method="post">
	<input type="hidden" name="memberId" value="${memberDto.memberId}">

<div class="container w-500">
	<div class="cell center"><h1>회원 정보 수정</h1></div>
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
	<div class="cell">
		<label>등급</label>
		<select name="memberLevel" required class="tool w-100">
			<option value="">선택하세요</option>
			<option value="일반회원" ${memberDto.memberLevel == '일반회원' ? 'selected' : ''}>일반회원</option>
			<option value="우수회원" ${memberDto.memberLevel == '우수회원' ? 'selected' : ''}>우수회원</option>
			<option value="관리자" ${memberDto.memberLevel == '관리자' ? 'selected' : ''}>관리자</option>
		</select>
	</div>
	<div class="cell">
		<label>포인트</label>
		<input type="number" name="memberPoint" value="${memberDto.memberPoint}" class="tool w-100 right">
	</div>
	<div class="cell right">
		<a href="search" class="btn">검색화면</a>
		<button class="btn negative">변경하기</button>
	</div>
</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


