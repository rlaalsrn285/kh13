<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-800">
	<div class="cell center">
		<h1>메뉴 목록</h1>
	</div>
	<div class="cell center">
		<%-- 검색창 --%>
		<form action="list" method="get">
			<select name="column" class="tool">
				<option value="menu_name_kor" ${param.column == 'menu_name_kor' ? 'selected' : ''}>메뉴명(한글)</option>
				<option value="menu_name_eng" ${param.column == 'menu_name_eng' ? 'selected' : ''}>메뉴명(영문)</option>
				<option value="menu_type" ${param.column == 'menu_type' ? 'selected' : ''}>메뉴유형</option>
			</select>
			<input type="text" name="keyword" placeholder="검색어 입력" required value="${param.keyword}" class="tool">
			<button class="btn positive">검색</button>
		</form>
	</div>
	<div class="cell right">
		<h2><a class="link link-animation" href="insert">신규 메뉴 등록</a></h2>		
	</div>
	
	<div class="cell">
		<%-- 목록 출력 --%>
		<table class="table table-horizontal">
			<thead>
				<tr>
					<th>메뉴번호</th>
					<th>메뉴이름</th>
					<th>메뉴유형</th>
					<th>판매가격</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.menuNo}</td>
					<td>
						<a href="detail?menuNo=${dto.menuNo}" class="link">
							${dto.menuNameKor}
							(${dto.menuNameEng})
						</a>
					</td>
					<td>${dto.menuType}</td>
		<%-- 			<td align="right">${dto.menuPrice}</td> --%>
					<td align="right">
						<fmt:formatNumber value="${dto.menuPrice}" pattern="#,##0"/> 
						원
					</td>
				</tr>
				</c:forEach>
			</tbody>	
		</table>
	</div>
</div>

<%-- 네비게이터 출력(구조는 복잡하지만 /board/list와 같지 않을까?) --%>
<jsp:include page="/WEB-INF/views/template/navigator.jsp"></jsp:include> 

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>









