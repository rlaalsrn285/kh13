<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<!DOCTYPE html>
	<html>
		<head>
		<meta charset="UTF-8">
		<title>나의 홈페이지</title>
		</head>
	<body>
	<div>
	<a href="/">홈주소</a>
	<a href="/emp/list">사원시스템</a>
	<a href="/menu/list">메뉴시스템</a>
	</div>
		<cc:choose>
			<cc:when test="${sessionScope.loginId != null}">
				<a href="/member/logout">로그아웃</a>
				<a href="/member/mypage">마이페이지</a>
			</cc:when>
			
			<cc:otherwise>
			<a href="/member/join">회원가입</a>
			<a href="/member/login">로그인</a>
			</cc:otherwise>
		</cc:choose>
		
			로그인 상태 = ${sessionScope.loginId != null} //// 
			로그인아디 = ${sessionScope.loginId}
	<div>