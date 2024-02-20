<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%--
	절대경로
	<form action="/emp/insert2"></form>

	상대경로
	<form action="insert2"></form>	
 --%>
<form action="insert" method="post" autocomplete="off">
<div class="container w-400">
	<div class="cell center"><h1>사원 등록</h1></div>
	<div class="cell">
		<label>사원명</label>
		<input name="empName" type="text" class="tool w-100">
	</div>
	<div class="cell">
		<label>부서명</label>
		<input name="empDept" type="text" class="tool w-100">
	</div>
	<div class="cell">
		<label>입사일</label>
		<input name="empDate" type="date" class="tool w-100">
	</div>
	<div class="cell">
		<label>급여액</label>
		<input name="empSal" type="text" class="tool w-100 right">
	</div>
	<div class="cell">
		<button class="btn positive w-100">사원등록</button>
	</div>
</div>
	
</form>	
 
 
 <%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
 
 
 
 