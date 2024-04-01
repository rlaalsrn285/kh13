<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%-- 
	파일을 전송하려는 form은 다음과 같이 설정해야 한다
	- method=post
	- encType=multipart/form-data 
--%>
<form action="add" method="post" enctype="multipart/form-data" autocomplete="off">

<div class="container w-400">
	<div class="cell center"><h1>판매 상품 등록</h1></div>
	<div class="cell">
		<label>상품명</label>
		<input type="text" name="itemName" required class="tool w-100">
	</div>
	<div class="cell">
		<label>판매액</label>
		<input type="number" name="itemPrice" required class="tool w-100 right">
	</div>
	<div class="cell">
		<label>충전액</label>
		<input type="number" name="itemCharge" required class="tool w-100 right">
	</div>
	<%--
		파일 선택은 input[type=file]로 한다
		- accept를 통해 원하는 유형만 선택할 수 있다
		- multiple 속성을 추가하면 여러 개의 파일을 선택할 수 있다
	 --%>
	<div class="cell">
		<label>이미지</label>
		<!-- 	<input type="file" name="attach" required accept=".png, .jpg, .gif" class="tool w-100">  -->
		<input type="file" name="attach" accept="image/*" class="tool w-100">
	</div>
	<div class="cell right">
		<a href="list" class="btn">목록보기</a>
		<button class="btn positive">신규등록</button>	
	</div>
</div>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>