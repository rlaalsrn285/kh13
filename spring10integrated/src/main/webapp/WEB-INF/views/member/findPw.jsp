<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="findPw" method="post">

아이디 <input type="text" name="memberId" required> <br><br>
이메일 <input type="email" name="memberEmail" required> <br><br>
<button type="submit">찾기</button>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>