<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="edit" method="post" enctype="multipart/form-data" autocomplete="off">
	<input type="hidden" name="itemNo" value="${itemDto.itemNo}">

<div class="container w-400">
	<div class="cell center"><h1>충전 상품 수정</h1></div>
	<div class="cell">
		<label>상품명</label>
		<input type="text" name="itemName" required value="${itemDto.itemName}" class="tool w-100">
	</div>
	<div class="cell">
		<label>판매액</label>
		<input type="number" name="itemPrice" required value="${itemDto.itemPrice}" class="tool w-100 right">
	</div>
	<div class="cell">
		<label>충전액</label>
		<input type="number" name="itemCharge" required value="${itemDto.itemCharge}" class="tool w-100 right">
	</div>
	<%-- input[type=file]에는 절대로 value를 설정할 수 없다(보안상의 이유) --%>
	<div class="cell">
		<label>이미지</label>
		<input type="file" name="attach" accept="image/*" class="tool w-100">
	</div>
	<div class="cell">
		<img src="image?itemNo=${itemDto.itemNo}" width="100">
	</div>
	<div class="cell right">
		<a href="list" class="btn">목록보기</a>
		<button class="btn positive">변경하기</button>	
	</div>
</div>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>