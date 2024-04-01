<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="row">
	<div class="col">
		<div class="p-4">
			<h1>자유 게시판</h1>
			<hr>
			<p>타인에 대한 무분별한 비방 또는 욕설은 경고 없이 삭제될 수 있습니다</p>
		</div>
	</div>
</div>

<div class="row mt-2">
	<div class="col text-end">
		<a href="write" class="btn btn-outline-primary">글쓰기</a>
	</div>
</div>

<div class="row mt-2">
	<div class="col">
		<table class="table table-hover">
			<thead class="text-center">
				<tr>
					<th>번호</th>
					<th width="40%">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>그룹</th>
					<th>대상</th>
					<th>차수</th>
				</tr>
			</thead>
			<tbody class="text-center">
				<c:forEach var="boardDto" items="${list}">
				<tr>
					<td>${boardDto.boardNo}</td>
					<%-- 제목 칸 --%>
					<td class="text-start">
						<%-- 제목 앞에 차수만큼 띄어쓰기 처리 --%>
						<c:forEach var="i" begin="1" end="${boardDto.boardDepth}" step="1">
							&nbsp;&nbsp;
						</c:forEach>
						
						<%-- 답글일 경우만 이미지를 출력 --%>
						<c:if test="${boardDto.boardDepth > 0}">
							→
						</c:if>
						
						<%-- 제목 출력 --%>
						<a class="link" href="detail?boardNo=${boardDto.boardNo}">
							${boardDto.boardTitle}
						</a>
					</td>
					<%--
					<c:choose>
						<c:when test="${boardDto.boardWriter == null}">
							<td>탈퇴한사용자</td>
						</c:when>			
						<c:otherwise>
							<td>${boardDto.boardWriter}</td>
						</c:otherwise>
					</c:choose>
					 --%>
				 	<td>${boardDto.boardWriterStr}</td>
					<td>${boardDto.boardWtimeStr}</td>
					<td>${boardDto.boardReadcount}</td>
					<td>${boardDto.boardGroup}</td>
					<td>${boardDto.boardTarget}</td>
					<td>${boardDto.boardDepth}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table> 
	</div>
</div>

<div class="row">
	<div class="col">
		<%-- 네비게이터 --%>
		<jsp:include page="/WEB-INF/views/template/navigator.jsp"></jsp:include>
	</div>
</div>		

<%-- 검색창 --%>
<form action="list" method="get" class="row row-cols-lg-auto g-3 align-items-center justify-content-center">
	<div class="col">
	<select name="column" class="form-select">
		<option value="board_title" ${param.column == 'board_title' ? 'selected' : ''}>제목</option>
		<option value="board_writer" ${param.column == 'board_writer' ? 'selected' : ''}>작성자</option>
		<option value="board_content" ${param.column == 'board_content' ? 'selected' : ''}>내용</option>
	</select>
	</div>
	<div class="col w-50">
	<input class="form-control" type="search" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	</div>
	<div class="col">
	<button class="btn btn-success">검색</button>
	</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>






