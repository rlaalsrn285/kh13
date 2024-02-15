<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
	HTML은 여러 버전이 있었으며, 지금은 HTML 5가 표준
	- 디자인과 관련된 요소를 많이 제거하고 다른 언어들과의 화합을 고려
	- 자체적으로 제공하는 컴포넌트(화면도구)를 많이 늘렸음
	
	<!DOCTYPE html> 은 HTML5 임을 표시하는 것
	
	<html> 은 HTML 문서의 범위를 정하는 태그(없으면 자동으로 생김)
	<html> 은 <head>와 <body>로 나뉜다
	<head> 에는 문서의 정보를 작성하고 <body>에는 화면에 표시할 내용을 작성
	
	<meta>는 홈페이지의 정보를 설정하는 태그
	<title>은 문서의 제목이며 브라우저의 탭 부분에 표시됨
 --%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>나의 홈페이지</title>
		
		<!-- 구글 폰트 -->
	    <link rel="preconnect" href="https://fonts.googleapis.com">
	    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
	
	    <!-- 내가 구현한 스타일 -->
		<link rel="stylesheet" type="text/css" href="/css/commons.css">
		<link rel="stylesheet" type="text/css" href="/css/test.css">
	
	    <!-- font awesome 아이콘 CDN -->
	    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
	</head>
	<body>
		<%-- 
			상단 영역
			- 홈페이지에서 가장 많이 보이는 부분
			- 로고, 검색창, 각종 메뉴들을 배치	
			- div는 투명한 영역
		--%>
		<ul class="menu" style="width:1200px">
		
			<li>
				<a href="/">
					<i class="fa-solid fa-house"></i>
					HOME
				</a>
			</li>
		
	        <li>
	            <a href="#">데이터관리</a>
	            <ul>
	                <li><a href="/pocketmon/list">포켓몬스터</a></li>
	                <li><a href="/emp/list">사원정보</a></li>
	                <li><a href="/menu/list">메뉴정보</a></li>
	                <li><a href="/student/list">학생성적</a></li>
	            </ul>
	        </li>
	        
	        <li><a href="/board/list">자유게시판</a></li>
	        
	        <%-- 관리자 메뉴는 관리자에게만 출력 --%>
	        <c:if test="${sessionScope.loginLevel == '관리자'}">
	        <li>
	            <a href="#">관리자메뉴</a>
	            <ul>
	                <li><a href="/admin/member/search">회원관리</a></li>
	                <li><a href="/admin/item/list">충전상품관리</a></li>
	                <li>
	                    <a href="#">통계</a>
	                    <ul>
	                        <li><a href="/admin/stat/pocketmon">포켓몬통계</a></li>
	                        <li><a href="/admin/stat/emp">사원통계</a></li>
	                        <li><a href="/admin/stat/menu">메뉴통계</a></li>
	                        <li><a href="/admin/stat/member">회원통계</a></li>
	                    </ul>
	                </li>
	            </ul>
	        </li>
	        </c:if>
	        
	        <li class="menu-end">
	        	<c:choose>
					<c:when test="${sessionScope.loginId != null}">
						<a href="/member/mypage">
							<i class="fa-solid fa-user"></i>
							${sessionScope.loginId}
						</a>
			            <ul>
			                <li><a href="/point/charge">포인트충전</a></li>
			                <li><a href="/member/logout">로그아웃</a></li>
			            </ul>
					</c:when>
					<c:otherwise>
						<a href="/member/login">로그인</a>
			            <ul>
			                <li><a href="/member/join">회원가입</a></li>
			            </ul>
					</c:otherwise>
				</c:choose>
	        </li>
	    </ul>
		
		<hr>
		<%-- 
			중단 영역
			- 실질적인 홈페이지의 내용이 표시되는 영역
			- 크기는 무제한으로 늘어날 수 있음
		 --%>
		<div>