<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>학생 정보 수정</h1>

<form action="edit" method="post">
	<input type="hidden" name="studentId" value="${studentDto.studentId}">
	이름 <input type="text" name="name" required value="${studentDto.name}"><br><br>
	국어 <input type="number" name="koreanScore" required min="0" max="100" value="${studentDto.koreanScore}">점 <br><br>
	영어 <input type="number" name="englishScore" required min="0" max="100" value="${studentDto.englishScore}">점 <br><br>
	수학 <input type="number" name="mathScore" required min="0" max="100" value="${studentDto.mathScore}">점 <br><br>
	<button>수정</button>	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>