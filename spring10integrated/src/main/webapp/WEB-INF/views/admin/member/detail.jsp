<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>${memberDto.memberId} 님의 회원 정보</h1>

<table border="1" width="400">
	<tr>
		<th width="30%">아이디</th>
		<td>${memberDto.memberId}</td>
	</tr>
	<tr>
		<th>닉네임</th>
		<td>${memberDto.memberNick}</td>
	</tr>
	<tr>
		<th>이메일</th>
		<td>${memberDto.memberEmail}</td>
	</tr>
	<tr>
		<th>연락처</th>
		<td>${memberDto.memberContact}</td>
	</tr>
	<tr>
		<th>생년월일</th>
		<td>${memberDto.memberBirth}</td>
	</tr>
	<tr>
		<th>주소</th>
		<td>
			[${memberDto.memberPost}]
			${memberDto.memberAddress1}
			${memberDto.memberAddress2}
		</td>
	</tr>
	<tr>
		<th>등급</th>
		<td>${memberDto.memberLevel}</td>
	</tr>
	<tr>
		<th>포인트</th>
		<td>${memberDto.memberPoint} point</td>
	</tr>
	<tr>
		<th>가입일시</th>
		<td>
			<fmt:formatDate value="${memberDto.memberJoin}" pattern="y년 M월 d일 E H시 m분 s초"/>
		</td>
	</tr>
	<tr>
		<th>최종로그인</th>
		<td>
			<fmt:formatDate value="${memberDto.memberLogin}" pattern="y년 M월 d일 E H시 m분 s초"/>
		</td>
	</tr>
</table>

<h2><a href="#">임시 비밀번호 발행</a></h2>
<h2><a href="edit?memberId=${memberDto.memberId}">회원정보 변경</a></h2>
<h2><a href="delete?memberId=${memberDto.memberId}">회원 강제탈퇴</a></h2>

<hr>

<h1>포인트 구매 내역</h1>

<c:choose>
	<c:when test="${buyList.isEmpty()}">
		<h2>구매 내역이 존재하지 않습니다</h2>
	</c:when>
	<c:otherwise>
		<table border="1" width="600">
			<thead>
				<tr>
					<th>번호</th>
					<th>상품명</th>
					<th>수량</th>
					<th>구매금액</th>
					<th>구매일시</th>
				</tr>
			</thead>
			<tbody> 
				<c:forEach var="buyDto" items="${buyList}">
				<tr>
					<td>${buyDto.buySerial}</td>
					<td>${buyDto.itemName}</td>
					<td>${buyDto.buyQty}</td>
					<td>
						<fmt:formatNumber value="${buyDto.buyTotal}" pattern="#,##0"/>
					</td>
					<td>
						<fmt:formatDate value="${buyDto.buyTime}" 
														pattern="yyyy-MM-dd HH:mm"/>
					</td>
				</tr>		
				</c:forEach>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>





