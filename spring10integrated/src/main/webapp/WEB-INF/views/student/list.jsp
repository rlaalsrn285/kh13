<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-800">
	<div class="cell center">
		<h1>학생 목록/검색</h1>
	</div>
	<div class="cell right">
		<h2><a href="add" class="link link-animation">신규 학생 등록</a></h2>
	</div>
	<div class="cell center">
		<form action="list">
			<input type="text" name="keyword" placeholder="학생명 입력" required>
			<button>검색</button> 
		</form>
	</div>
	<hr>
	<div class="cell">
		<p>등록된 학생 총 ${list.size()}명</p>
	</div>
	<div class="cell">
		<table class="table table-border">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>메뉴</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${list.isEmpty()}">
					<tr>
						<%-- colspan은 적힌 숫자만큼 칸을 차지할 수 있도록 하는 속성 --%>
						<td colspan="5">데이터가 존재하지 않습니다</td>
					</tr>
					</c:when>
					<c:otherwise>
					<c:forEach var="studentDto" items="${list}">
					<tr>
						<td>${studentDto.studentId}</td>
						<td>${studentDto.name}</td>
						<td>${studentDto.koreanScore}</td>
						<td>${studentDto.englishScore}</td>
						<td>${studentDto.mathScore}</td>
						<td><a href="detail?studentId=${studentDto.studentId}" class="link">상세</a></td>
					</tr>
					</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>