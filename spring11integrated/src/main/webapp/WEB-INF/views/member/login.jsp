<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>로그인</h1>

<c:if test="${param.error != null}">
	<h3 style="color:red">로그인 정보가 일치하지 않습니다</h3>
</c:if>

<form action="login" method="post">
	아이디 <input type="text" name="memberId" required> <br><br>
	비밀번호 <input type="password" name="memberPw" required> <br><br>
	<button>로그인</button>	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>