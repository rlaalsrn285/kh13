<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>충전 상품 수정</h1>

<form action="edit" method="post" enctype="multipart/form-data">
	<input type="hidden" name="itemNo" value="${itemDto.itemNo}">
	
	상품명 <input type="text" name="itemName" value="${itemDto.itemName}" required> <br><br>
	판매가 <input type="number" name="itemPrice" value="${itemDto.itemPrice}" required><br><br>
	충전액 <input type="number" name="itemCharge" value="${itemDto.itemCharge}" required><br><br>
	
	<%-- input[type=file]에는 절대로 value를 설정할 수 없다(보안상의 이유) --%>
	<input type="file" name="attach"> <br>
	
	<img src="image?itemNo=${itemDto.itemNo}" width="100"><br><br>
	
	<button>변경</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>