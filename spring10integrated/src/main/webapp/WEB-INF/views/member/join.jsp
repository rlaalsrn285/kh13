<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>회원가입 정보입력</h1>
    
    <form action="join"method="post">
    아이디 * <input type="text" name="memberId" placeholder="소문자 시작, 숫자 포함 8~20자" required> <br><br>
    비밀번호 * <input type="password" name="memberPw" placeholder="대소문자,숫자,특수문자 포함 6~15자" required><br><br>
	닉네임 * <input type="text" name="memberNick" placeholder="한글숫자 2~10자" required> <br><br>
	이메일 * <input type="email" name="memberEmail" required> <br><br>
	생년월일 <input type="date" name="memberBirth"> <br><br>
	휴대전화 <input type="tel" name="memberContact"> <br><br>
	주소 <br><br>
	<input type="text" name="memberPost" placeholder="우편번호"> <br><br>
	<input type="text" name="memberAddress1" placeholder="기본주소"> <br><br>
	<input type="text" name="memberAddress2" placeholder="상세주소"> <br><br>
	<button>회원가입</button>
    
    </form>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>