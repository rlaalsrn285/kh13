<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
 
 <h1>게시글작성 페이지</h1>
 
 <form action="insert" method="post">
 <input type="text" name="boardTitle" placeholder="글제목칸100글자이내" required="required"> <br><br>
 <input type="text" name="boardContent" placeholder="글내용" required="required"> 
 
 <button>게시글등록버튼</button>
 </form>
 
 <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>