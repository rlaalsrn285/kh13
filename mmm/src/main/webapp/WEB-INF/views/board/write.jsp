<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="write" method="post" autocomplete="off">
	<%-- (중요) 답변글일 경우 대상의 번호가 반드시 등록페이지로 전송되야함 --%>
	<c:if test="${param.boardTarget != null}">
		<input type="hidden" name="boardTarget" value="${param.boardTarget}">
	</c:if>

<div class="container w-400">
	<div class="cell center"><h1>게시글 작성</h1></div>
	<div class="cell">
		<label>제목</label>
		<c:choose>
			<c:when test="${param.boardTarget == null}">
				<input type="text" name="boardTitle" required class="tool w-100">
			</c:when>
			<c:otherwise>
				<input type="text" name="boardTitle" required class="tool w-100" value="[Re] ${targetDto.boardTitle}">
			</c:otherwise>
		</c:choose>
	</div>
	<div class="cell">
		<label>내용</label>
		<%-- 
			여러 줄 입력하고 싶다면 textarea 태그를 사용한다 
			<input type="text" name="boardContent" required>
			
			textarea 태그는 종료 태그가 필요하며, type과 value를 설정할 수 없다
			 <textarea name="boardContent" required></textarea>
		--%>
		<textarea name="boardContent" required class="tool w-100" rows="10"></textarea>
	</div>
	<div class="cell right">
		<a href="list" class="btn">목록</a>
		<button class="btn positive">등록</button>
	</div>
</div>
	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>