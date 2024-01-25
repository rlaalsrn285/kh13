<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>비밀번호 변경</h1>
    
    <form action="password" method="post">
    기존 비밀번호 입력칸 <input type="password" name="originPw"> <br><br><br>
    변경 비밀번호 입력칸<input type="password" name="changePw"> <br><br>
    <button>변경하기</button>
    </form>
    
    <cc:if test="${param.error != null}">  <!-- 만약에 param에 error가 잇으면 즉 !=null이면 -->
    	<h1 style="color: yellow;">비밀번호 틀렷다 !!</h1>
    </cc:if>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>