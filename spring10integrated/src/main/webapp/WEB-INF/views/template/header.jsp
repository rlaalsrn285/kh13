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
	<a href="/member/login">로그인칸 링크</a>
	</div>
		<cc:choose>
			<cc:when test="${sessionScope.loginId != null}">
				<a href="/member/logout">로그아웃링크</a>
				<a href="/member/mypage">내정보링크(수정중)</a>
			</cc:when>
		</cc:choose>
	<div>