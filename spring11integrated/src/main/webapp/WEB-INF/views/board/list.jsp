<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>자유 게시판</h1>
<p>
	타인에 대한 무분별한 비방 또는 욕설은 경고 없이 삭제될 수 있습니다
</p>

<h2><a href="write">글쓰기</a></h2>

<%-- 테이블 --%>
<table border="1" width="800">
	<thead>
		<tr>
			<th>번호</th>
			<th width="40%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardDto" items="${list}">
		<tr>
			<td>${boardDto.boardNo}</td>
			<td align="left">
				<a href="detail?boardNo=${boardDto.boardNo}">
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
		</tr>
		</c:forEach>
	</tbody>
</table>

<%-- 네비게이터 --%>

<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<option value="board_title" ${param.column == 'board_title' ? 'selected' : ''}>제목</option>
		<option value="board_writer" ${param.column == 'board_writer' ? 'selected' : ''}>작성자</option>
		<option value="board_content" ${param.column == 'board_content' ? 'selected' : ''}>내용</option>
	</select>
	<input type="search" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	<button>검색</button>
</form>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>