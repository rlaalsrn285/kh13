<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    	<div>
	<a href="emp/list">사원시스템</a>
	<a href="menu/list">메뉴시스템</a>
	<a href="/emp/list">사원시스템</a>
	<a href="/menu/list">메뉴시스템</a>
	</div>
	
	<div>
    
<h1>메뉴등록</h1>

<form action="insert" method="post" >

	메뉴이름(한글) : <input name="menuNameKor" required><br><br><br>
	메뉴이름(영어) : <input name="menuNameEng" required="required"><br><br><br>

	<select name="menuType" required>
		<option value="">선택하세요</option>
		<option value="커피">커피</option>
		<option value="스무디">스무디</option>
		<option value="에이드">에이드</option>
		<option value="디저트">디저트</option>
	</select>
	<br><br>	
		
	가격 : <input name="menuPrice"><br><br><br>
	<button>메뉴등로로록</button>

</form>