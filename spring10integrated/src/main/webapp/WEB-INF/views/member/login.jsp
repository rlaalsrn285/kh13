<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>�α���������������</h1>
	
	<cc:if test="${param.error != null}">
	<h1>�α��� �Ұ� �̴�</h2>
	</cc:if>
	
	<form action="login" method="post">
		���̵� <input type="text" name="memberId" required> <br><br>
		��й�ȣ <input type="password" name="memberPw" required> <br><br>
	<button>�α���</button>	
	</form>
	
	<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>