<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    <h1>�������� ����</h1>
    <form action="change" method="post">
    	�г��� * <input type="text" name="memberNick" required value="${mmmdto.memberNick}"> <br><br>
    	�̸��� * <input type="email" name="memberEmail" required value="${mmmdto.memberEmail}"> <br><br>
    
    	<button>�����ϱ�</button>
    </form>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>