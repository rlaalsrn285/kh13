<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    	<div>
	<a href="emp/list">사원시스템</a>
	<a href="menu/list">메뉴시스템</a>
	<a href="/emp/list">사원시스템</a>
	<a href="/menu/list">메뉴시스템</a>
	</div>
	
	<div>
    
<h1>사원정보수정페이지</h1>

<form action="edit" method="post">
	사원번호 : <input type="hidden" name="empNo" value="${qqq.empNo}"> <br><br><br>
	사원이름 : <input type="text" name="empName" value="${qqq.empName}"> <br><br><br>
	사원부서 : <input type="text" name="empDept" value="${qqq.empDept}"> <br><br><br>
	사원입사날짜 : <input type="date" name="empDate" value="${qqq.empDate}"> <br><br><br>
	사원월급 : <input type="number" name="empSal" value="${qqq.empSal}"> <br><br><br>
	
	<button> 사원 정보 수정</button>
	
</form>

</div>
	
	<div>
	<h1> 하단영역</h1>
	<h1> ㅁㄴㅇㄻㄴㅇㄹ</h1>
	</div>