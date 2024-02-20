<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>포켓몬스터 정보 수정</h1>

<form action="edit" method="post">
	번호 <input type="text" name="pocketmonNo"> <br><br>
	이름 <input type="text" name="pocketmonName">	 <br><br>
	속성 <input type="text" name="pocketmonType"> <br><br>
	<button>정보 수정</button>
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

