<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    <h1>개인정보 변경</h1>
    <form action="change" method="post">
    	닉네임 * <input type="text" name="memberNick" required value="${mmmdto.memberNick}"> <br><br>
    	이메일 * <input type="email" name="memberEmail" required value="${mmmdto.memberEmail}"> <br><br>
    
    	<button>변경하기</button>
    </form>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>