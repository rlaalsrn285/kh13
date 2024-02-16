<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-600">
	<div class="cell">
		<h1>
			포켓몬 목록
			<a class="btn positive" href="insert1">
				<i class="fa-solid fa-plus"></i>
				신규등록
			</a>
		</h1>
	</div>
	<div class="cell center">
		<%-- 검색창 --%>
		<form action="list" method="get">
			<select name="column" class="tool">
				<option value="pocketmon_name">이름</option>
				<option value="pocketmon_type">속성</option>
			</select>
			<input type="search" name="keyword" value="${param.keyword}" class="tool">
			<button class="btn positive">
				<i class="fa-solid fa-magnifying-glass"></i>
				검색
			</button>
		</form>
	</div>
	<div class="cell">
		<table class="table table-horizontal table-stripe">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>속성</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
				<%-- for(PocketmonDto dto : list) --%>
				<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.pocketmonNo}</td>
					<td>${dto.pocketmonName}</td>
					<td>${dto.pocketmonType}</td>
					<td>
						<a class="link" href="detail?pocketmonNo=${dto.pocketmonNo}">
							<i class="fa-solid fa-circle-info"></i>
							보기
						</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>




