<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%-- 네비게이터 --%>
<ul class="pagination justify-content-center">
	<%-- 이전이 있을 경우만 링크를 제공 --%>
	<c:choose>
		<c:when test="${pageVO.isFirstBlock()}">
			<li class="page-item disabled"><a class="page-link" href="#"><i class="fa-solid fa-angle-left"></i></a></li>
		</c:when>
		<c:otherwise>
			<li class="page-item"><a class="page-link" href="list?page=${pageVO.getPrevBlock()}&${pageVO.getQueryString()}"><i class="fa-solid fa-angle-left"></i></a></li>
		</c:otherwise>
	</c:choose>
	
	<c:forEach var="i" begin="${pageVO.getBeginBlock()}" end="${pageVO.getEndBlock()}" step="1">
		<%-- 다른 페이지일 경우만 링크를 제공 --%>
		<c:choose>
			<c:when test="${pageVO.isCurrentPage(i)}">
				<li class="page-item active"><a class="page-link">${i}</a></li>
			</c:when>
			<c:otherwise>
				<li class="page-item"><a class="page-link" href="list?page=${i}&${pageVO.getQueryString()}">${i}</a></li>
			</c:otherwise>
		</c:choose>
	</c:forEach>
    
    <%-- 다음이 있을 경우만 링크를 제공 --%>
	<c:choose>
		<c:when test="${pageVO.isLastBlock()}">
			<li class="page-item disabled"><a class="page-link" href="#"><i class="fa-solid fa-angle-right"></i></a></li>
		</c:when>
		<c:otherwise>
			<li class="page-item"><a class="page-link" href="list?page=${pageVO.getNextBlock()}&${pageVO.getQueryString()}"><i class="fa-solid fa-angle-right"></i></a></li>
		</c:otherwise>
	</c:choose>
    
</ul>

