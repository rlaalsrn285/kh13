<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>로그인페이지임임임</h1>
	
	<cc:if test="${param.error != null}">
	<h1>로그인 불가 이다</h2>
	</cc:if>
	
	<form action="login" method="post">
		아이디 <input type="text" name="memberId" required> <br><br>
		비밀번호 <input type="password" name="memberPw" required> <br><br>
	<button>로그인</button>	
	</form>
	
	<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>