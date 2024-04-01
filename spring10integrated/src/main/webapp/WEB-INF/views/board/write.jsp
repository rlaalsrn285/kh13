<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script src="${pageContext.request.contextPath}/js/exit.js"></script>

<form action="write" method="post" autocomplete="off">
	<%-- (중요) 답변글일 경우 대상의 번호가 반드시 등록페이지로 전송되야함 --%>
	<c:if test="${param.boardTarget != null}">
		<input type="hidden" name="boardTarget" value="${param.boardTarget}">
	</c:if>
	
	<div class="row">
		<div class="col">
			<div class="p-4 text-center">
				<h1>게시글 작성</h1>
				<p>타인에 대한 무분별한 비방 또는 욕설은 경고 없이 삭제될 수 있습니다</p>
			</div>
		</div>
	</div>
	
	<div class="row mt-4">
		<div class="col">
			<label>제목</label>
			<c:choose>
				<c:when test="${param.boardTarget == null}">
					<input type="text" name="boardTitle" required class="form-control">
				</c:when>
				<c:otherwise>
					<input type="text" name="boardTitle" required class="form-control" value="[Re] ${targetDto.boardTitle}">
				</c:otherwise>
			</c:choose>
		</div>
	</div>

	<div class="row mt-4">
		<div class="col">
			<label>내용</label>
			<textarea name="boardContent" required class="form-control" rows="10"></textarea>
		</div>
	</div>
	
	<div class="row mt-4">
		<div class="col text-end">
			<a href="list" class="btn btn-secondary">목록</a>
			<button class="btn btn-success">등록</button>
		</div>
	</div>
	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>