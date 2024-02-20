<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="edit" method="post" autocomplete="off">
<input type="hidden" name="empNo" required value="${dto.empNo}">
<div class="container w-400">
	<div class="cell center"><h1>사원 정보 변경</h1></div>
	<div class="cell">
		<label>사원이름</label>
		<input type="text" name="empName" required value="${dto.empName}" class="tool w-100">
	</div>
	<div class="cell">
		<label>부서명</label>
		<input type="text" name="empDept" required value="${dto.empDept}" class="tool w-100">
	</div>
	<div class="cell">
		<label>입사일</label>
		<input type="date" name="empDate" required value="${dto.empDate}" class="tool w-100">
	</div>
	<div class="cell">
		<label>급여액</label>
		<input type="number" name="empSal" required value="${dto.empSal}" class="tool w-100 right">
	</div>
	<div class="cell">
		<button class="btn positive w-100">정보 수정</button>
	</div>
</div>



	
	  <br><br>
	  <br><br>
	  <br><br>
	  <br><br>
	
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


