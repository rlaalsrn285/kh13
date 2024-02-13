<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>나의 홈페이지</title>
		<link rel="stylesheet" type="text/css" href="/css/commons.css">
		<link rel="stylesheet" type="text/css" href="/css/test.css">
	</head>
	<body>
		
		<div>
			<a href="/">홈으로</a>
			<a href="/pocketmon/list">포켓몬스터 시스템</a>
			<a href="/emp/list">사원관리 시스템</a>
			<a href="/menu/list">메뉴관리 시스템</a>
			<a href="/student/list">학생관리 시스템</a>
			<a href="/board/list">자유게시판</a>
		</div>
		<%-- 로그인 여부에 따라 달라지는 메뉴 --%>
		<div>
			<c:choose>
				<c:when test="${sessionScope.loginId != null}">
					<a href="/member/logout">로그아웃</a>
					<a href="/member/mypage">내정보</a>
					<a href="/point/charge">포인트충전</a>
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
			<a href="/admin/member/search">회원관리</a>
			<a href="/admin/item/list">충전상품관리</a>
			<a href="/admin/stat/pocketmon">포켓몬통계</a>
			<a href="/admin/stat/emp">사원통계</a>
			<a href="/admin/stat/menu">메뉴통계</a>
			<a href="/admin/stat/member">회원통계</a>
		</div>		
		</c:if>
		<div>
		
			login = ${sessionScope.loginId != null} , 
			loginId = ${sessionScope.loginId} ,
			loginLevel = ${sessionScope.loginLevel}
		</div>
		<hr>
	
		<div>