<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>

<h1> jstl이용</h1>

<h2> n = ${param.n}</h2>





<cc:choose>
	<cc:when test="${param.n % 2 == 0}">
	<h1> n은짝수</h1>
	</cc:when>
	<cc:otherwise>
	<h1> n은 호오올수</h1>
	</cc:otherwise>
</cc:choose>