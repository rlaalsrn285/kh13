<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-600">
	<div class="cell">
		<%-- 페이지 제목 --%>
		<c:choose>
			<c:when test="${isSearch}">
				<h1>사원 검색</h1>
			</c:when>
			<c:otherwise>
				<h1>사원 목록</h1>
			</c:otherwise>
		</c:choose>
	</div>
	
	<div class="cell right">
		<h2><a href="insert" class="link link-animation">신규 사원 등록</a></h2>
	</div>
	
	<div class="cell center">
		<%-- 검색창 --%>
		<form action="list" method="get">
			<select name="column" class="tool">
				<%-- 
					EL은 문자열도 == 로 비교한다 (물론 equals도 가능)
					EL은 문자열을 쌍따옴표로 쓰건 외따옴표로 쓰건 상관하지 않는다
				 --%>
				<c:choose>
					<c:when test="${param.column == 'emp_name'}">
						<option value="emp_name" selected>사원명</option>
					</c:when>
					<c:otherwise>
						<option value="emp_name">사원명</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${param.column == 'emp_dept'}">
						<option value="emp_dept" selected>부서명</option>
					</c:when>
					<c:otherwise>
						<option value="emp_dept">부서명</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${param.column == 'emp_date'}">
						<option value="emp_date" selected>입사일</option>	
					</c:when>
					<c:otherwise>
						<option value="emp_date">입사일</option>
					</c:otherwise>
				</c:choose>
			</select>
			<input type="search" name="keyword" placeholder="검색어 입력" required
					value="${param.keyword}" class="tool">
			<button class="btn positive">검색</button>
		</form>
	</div>
	
	<form action="deleteAll" method="post">
	<div class="cell">
		<%-- 목록 출력 --%>
		<table class="table table-horizontal">
			<thead>
				<tr>
					<c:if test="${sessionScope.loginLevel == '관리자'}">
					<th>
						<input type="checkbox" class="check-all">
					</th>
					</c:if>
					<th>사원번호</th>
					<th>사원명</th>
					<th>부서명</th>
					<th>입사일</th>
		<!-- 			<th>급여액</th> -->
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="dto" items="${list}">
				<tr>
					<c:if test="${sessionScope.loginLevel == '관리자'}">
					<td>
						<input type="checkbox" class="check-item"
									name="empNo" value="${dto.empNo}">
					</td>
					</c:if>
					<td>${dto.empNo}</td>
					<td>
						<a href="detail?empNo=${dto.empNo}" class="link">${dto.empName}</a>
					</td>
					<td>${dto.empDept}</td>
					<td>${dto.empDate}</td>
		<%-- 			<td>${dto.empSal}원</td> --%>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<c:if test="${sessionScope.loginLevel == '관리자'}">
	<!-- 삭제 버튼 -->
	<div class="cell right">
		<button class="btn negative">전체삭제</button>
	</div>
	</c:if>
	</form>
	
</div>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


