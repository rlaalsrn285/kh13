<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script src="/js/exit.js"></script>

<form action="edit" method="post" autocomplete="off">
	<input type="hidden" name="boardNo" value="${boardDto.boardNo}">

	<div class="row">
		<div class="col">
			<div class="p-4 text-center">
				<h1>게시글 수정</h1>
				<p>타인에 대한 무분별한 비방 또는 욕설은 경고 없이 삭제될 수 있습니다</p>
			</div>
		</div>
	</div>
	
	<div class="row mt-4">
		<div class="col">
			<label>제목</label>
			<input type="text" name="boardTitle" required class="form-control" value="${boardDto.boardTitle}">
		</div>
	</div>

	<div class="row mt-4">
		<div class="col">
			<label>내용</label>
			<textarea name="boardContent" required class="form-control" rows="10">${boardDto.boardContent}</textarea>
		</div>
	</div>
	
	<div class="row mt-4">
		<div class="col text-end">
			<a href="list" class="btn btn-secondary">목록</a>
			<button class="btn btn-success">수정</button>
		</div>
	</div>
	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>