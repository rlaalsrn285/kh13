<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="ffmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>${mmdto.memberId} �� ���� �Դϴٴٴ�</h1>
    
    <table border="5" width="550">
    	<tr>
    		<th width="25%">�г���ĭ</th>
    		<td>${mmdto.memberNick}</td>
    	</tr>
    	
    	<tr>
		<th>�̸���ĭ</th>
		<td>${mmdto.memberEmail}</td>
		</tr>
		
		<tr>
		<th>����óĭ</th>
		<td>${mmdto.memberContact}</td>
		</tr>	
    	
    	<tr>
		<th>�������ĭ</th>
		<td>${mmdto.memberBirth}</td>
		</tr>
    
    	<tr>
		<th>�ּ�ĭ</th>
		<td>
			[${mmdto.memberPost}] 
			${mmdto.memberAddress1}
			${mmdto.memberAddress2}
		</td>
		</tr>
		
		<tr>
		<th>���ĭ</th>
		<td>${mmdto.memberLevel}</td>
		</tr>
		
		<tr>
		<th>����Ʈĭ</th>
		<td>${mmdto.memberPoint} point</td>
		</tr>
		
		<tr>
			<th>�����Ͻ� ĭ</th>
			<td><ffmt:formatDate value="${mmdto.memberJoin}" pattern="Y�� M�� D�� H�� M�� S��"/>
		</tr>
		
		<tr>
		<th>�α����Ͻ�</th>
		<td>
			<ffmt:formatDate value="${memberDto.memberLogin}" pattern="Y�� M�� D�� H�� M�� S��"/>
		</td>
		</tr>
    </table>
    
    <h2><a href="#">��й�ȣ ����(�����������̿ϼ�)</a></h2>
	<h2><a href="#">�������� ����(�����������̿ϼ�)</a></h2>
	<h2><a href="#">ȸ�� Ż��(�����������̿ϼ�)</a></h2>
    
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>