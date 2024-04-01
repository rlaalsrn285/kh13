<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>${studentDto.name} 님의 성적 정보</h1>

<table border="1" width="400">
	<tbody>
		<tr>
			<th width="30%">성적번호</th>
			<td>${studentDto.studentId}</td>
		</tr>
		<tr>
			<th>국어점수</th>
			<td>${studentDto.koreanScore}점</td>
		</tr>
		<tr>
			<th>영어점수</th>
			<td>${studenDto.englishScore}점</td>
		</tr>
		<tr>
			<th>수학점수</th>
			<td>${studentDto.mathScore}점</td>
		</tr>	
		<%-- 총점은 ${studentDto.total}로 부르면 getTotal() 메소드 자동 추론 --%>
		<tr>
			<th>총점</th>
			<td>${studentDto.total}점</td>
		</tr>
		<tr>
			<th>평균</th>
			<td>
				<fmt:formatNumber value="${studentDto.average}" pattern="##0.00"/>
			</td>
		</tr>
		<tr>
			<th>석차</th>
			<td>${rank}</td>
		</tr>
	</tbody>
</table>

<h2><a href="list">목록으로</a></h2>
<h2><a href="edit?studentId=${studentDto.studentId}">수정하기</a></h2>
<h2><a href="delete?studentId=${studentDto.studentId}">삭제하기</a></h2>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>