<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>��й�ȣ ����</h1>
    
    <form action="password" method="post">
    ���� ��й�ȣ �Է�ĭ <input type="password" name="originPw"> <br><br><br>
    ���� ��й�ȣ �Է�ĭ<input type="password" name="changePw"> <br><br>
    <button>�����ϱ�</button>
    </form>
    
    <cc:if test="${param.error != null}">  <!-- ���࿡ param�� error�� ������ �� !=null�̸� -->
    	<h1 style="color: yellow;">��й�ȣ Ʋ�Ǵ� !!</h1>
    </cc:if>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>