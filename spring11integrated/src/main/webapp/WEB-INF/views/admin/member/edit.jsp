<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>회원 정보 수정</h1>

<%--
	추가로 전달할 정보 - 아이디(hidden)
	수정할 정보 - 닉네임,이메일,생년월일,연락처,주소,(+등급,포인트)	
 --%>
<form action="edit" method="post">
	<input type="hidden" name="memberId" value="${memberDto.memberId}">
	
	닉네임 <input type="text" name="memberNick" value="${memberDto.memberNick}" required> <br><br>
	이메일 <input type="email" name="memberEmail" value="${memberDto.memberEmail}" required> <br><br>
	연락처 <input type="tel" name="memberContact" value="${memberDto.memberContact}"> <br><br>
	생년월일 <input type="date" name="memberBirth" value="${memberDto.memberBirth}"> <br><br>
	주소 <br>
	<input type="text" name="memberPost" value="${memberDto.memberPost}" placeholder="우편번호"> <br>
	<input type="text" name="memberAddress1" value="${memberDto.memberAddress1}" placeholder="기본주소"><br>
	<input type="text" name="memberAddress2" value="${memberDto.memberAddress2}" placeholder="상세주소"><br><br>
	등급 
	<select name="memberLevel" required>
		<option value="">선택하세요</option>
		<option value="일반회원" ${memberDto.memberLevel == '일반회원' ? 'selected' : ''}>일반회원</option>
		<option value="우수회원" ${memberDto.memberLevel == '우수회원' ? 'selected' : ''}>우수회원</option>
		<option value="관리자" ${memberDto.memberLevel == '관리자' ? 'selected' : ''}>관리자</option>
	</select>
	<br><br> 
	포인트 <input type="number" name="memberPoint" value="${memberDto.memberPoint}"><br><br>
	
	<button>변경</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>