<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="ffmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>${mmdto.memberId} 의 정보 입니다다다</h1>
    
    <table border="5" width="550">
    	<tr>
    		<th width="25%">닉네임칸</th>
    		<td>${mmdto.memberNick}</td>
    	</tr>
    	
    	<tr>
		<th>이메일칸</th>
		<td>${mmdto.memberEmail}</td>
		</tr>
		
		<tr>
		<th>연락처칸</th>
		<td>${mmdto.memberContact}</td>
		</tr>	
    	
    	<tr>
		<th>생년월일칸</th>
		<td>${mmdto.memberBirth}</td>
		</tr>
    
    	<tr>
		<th>주소칸</th>
		<td>
			[${mmdto.memberPost}] 
			${mmdto.memberAddress1}
			${mmdto.memberAddress2}
		</td>
		</tr>
		
		<tr>
		<th>등급칸</th>
		<td>${mmdto.memberLevel}</td>
		</tr>
		
		<tr>
		<th>포인트칸</th>
		<td>${mmdto.memberPoint} point</td>
		</tr>
		
		<tr>
			<th>가입일시 칸</th>
			<td><ffmt:formatDate value="${mmdto.memberJoin}" pattern="Y년 M월 D일 H시 M분 S초"/>
		</tr>
		
		<tr>
		<th>로그인일시</th>
		<td>
			<ffmt:formatDate value="${memberDto.memberLogin}" pattern="Y년 M월 D일 H시 M분 S초"/>
		</td>
		</tr>
    </table>
    
    <h2><a href="#">비밀번호 변경(마이페이지미완성)</a></h2>
	<h2><a href="#">개인정보 변경(마이페이지미완성)</a></h2>
	<h2><a href="#">회원 탈퇴(마이페이지미완성)</a></h2>
    
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>