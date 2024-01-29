<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>나의 홈페이지</title>
	</head>
	<body>
		<%-- 
			상단 영역
			- 홈페이지에서 가장 많이 보이는 부분
			- 로고, 검색창, 각종 메뉴들을 배치	
			- div는 투명한 영역
		--%>
		<div>
			<%-- 템플릿 페이지는 무조건 절대경로를 써야한다 --%>
			<a href="/">홈으로</a>
			<a href="/pocketmon/list">포켓몬스터 시스템</a>
			<a href="/emp/list">사원관리 시스템</a>
			<a href="/menu/list">메뉴관리 시스템</a>
			<a href="/student/list">학생관리 시스템</a>
		</div>
		<%-- 로그인 여부에 따라 달라지는 메뉴 --%>
		<div>
			<c:choose>
				<c:when test="${sessionScope.loginId != null}">
					<a href="/member/logout">로그아웃</a>
					<a href="/member/mypage">내정보</a>
				</c:when>
				<c:otherwise>
					<a href="/member/join">회원가입</a>
					<a href="/member/login">로그인</a>
				</c:otherwise>
			</c:choose>
		</div>
		<%-- 관리자 메뉴 - 관리자일 경우만 출력 --%>
		<c:if test="${sessionScope.loginLevel == '관리자'}">
		<div>
			<a href="#">회원관리</a>
			<a href="/admin/stat/pocketmon">포켓몬통계</a>
			<a href="/admin/stat/emp">사원통계</a>
			<a href="/admin/stat/menu">메뉴통계</a>
			<a href="/admin/stat/member">회원통계</a>
		</div>		
		</c:if>
		<div>
			<%--
			<c:choose>
				<c:when test="${sessionScope.loginId != null}">
					<a href="/member/testLogout">테스트로그아웃</a>
				</c:when>
				<c:otherwise>
					<a href="/member/testLogin">테스트로그인</a>
				</c:otherwise>
			</c:choose>
			 --%>
			
			login = ${sessionScope.loginId != null} , 
			loginId = ${sessionScope.loginId} ,
			loginLevel = ${sessionScope.loginLevel}
		</div>
		<hr>
		<%-- 
			중단 영역
			- 실질적인 홈페이지의 내용이 표시되는 영역
			- 크기는 무제한으로 늘어날 수 있음
		 --%>
		<div>