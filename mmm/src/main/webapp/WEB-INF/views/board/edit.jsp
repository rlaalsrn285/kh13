<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="edit" method="post" autocomplete="off">
	<input type="hidden" name="boardNo" value="${boardDto.boardNo}">

<div class="container w-400">
	<div class="cell center"><h1>게시글 수정</h1></div>
	<div class="cell">
		<label>제목</label>
		<input type="text" name="boardTitle" required class="tool w-100" value="${boardDto.boardTitle}">
	</div>
	<div class="cell">
		<label>내용</label>
		<%-- textarea는 시작태그와 종료태그 사이에 내용을 작성 --%>
		<textarea name="boardContent" required class="tool w-100" rows="10">${boardDto.boardContent}</textarea>
	</div>
	<div class="cell right">
		<a href="list" class="btn">목록</a>
		<button class="btn positive">수정</button>
	</div>
</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>