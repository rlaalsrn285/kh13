<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<!-- 마이페이지 화면 구현 -->
<div class="row">
    <!-- 프로필 이미지와 메뉴가 위치할 자리 -->
   <div class="col-sm-3">
   		<div class="row">
   			<div class="col text-center">
   				<h2>${memberDto.memberId}</h2>
   			</div>
   		</div>

       <!-- 프로필 이미지 -->
       <div class="row">
           <div class="col text-center">
               <img src="image" width="100%" style="max-width: 200px;"
                   class="img-thumbnail rounded-circle">
           </div>
       </div>

       <!-- 선택 가능한 메뉴 -->
       <div class="row mt-2">
           <div class="col">

               <div class="list-group list-group-flush">
                   <a href="/member/password" class="list-group-item list-group-item-action text-center">비밀번호 변경</a>
                   <a href="/member/change" class="list-group-item list-group-item-action text-center">개인정보 변경</a>
                   <a href="/member/exit" class="list-group-item list-group-item-action text-center">회원 탈퇴</a>
               </div>

           </div>
       </div>

   </div>

   <!-- 내역이 보여질 자리 -->
   <div class="col-sm-9">
       
       <!-- 기본 회원 정보 -->
       <div class="row">
           <div class="col">
               <h2>기본 회원 정보</h2>
               <hr>

               <table class="table mt-2 table-borderless">
                   <tr>
                       <th class="text-center">닉네임</th>
                       <td>${memberDto.memberNick}</td>
                   </tr>
                   <tr>
                       <th class="text-center">이메일</th>
                       <td>${memberDto.memberEmail}</td>
                   </tr>
                   <tr>
                       <th class="text-center">연락처</th>
                       <td>${memberDto.memberContact}</td>
                   </tr>
                   <tr>
                       <th class="text-center">생년월일</th>
                       <td>${memberDto.memberBirth}</td>
                   </tr>
                   <tr>
                       <th class="text-center">주소</th>
                       <td>
							[${memberDto.memberPost}] 
							${memberDto.memberAddress1}
							${memberDto.memberAddress2}
						</td>
                   </tr>
                   <tr>
                       <th class="text-center">등급</th>
                       <td>${memberDto.memberLevel}</td>
                   </tr>
                   <tr>
                       <th class="text-center">포인트</th>
                       <td><fmt:formatNumber value="${memberDto.memberPoint}" pattern="#,##0"/> point</td>
                   </tr>
                   <tr>
                       	<th class="text-center">가입일시</th>
                       	<td>
                    		<fmt:formatDate value="${memberDto.memberJoin}" 
														pattern="y년 M월 d일 H시 m분 s초"/>   
						</td>
                   	</tr>
                   <tr>
                       	<th class="text-center">로그인일시</th>
                       	<td>
                       		<fmt:formatDate value="${memberDto.memberJoin}" 
														pattern="y년 M월 d일 H시 m분 s초"/>
						</td>
                   </tr>
               </table>
           </div>
       </div>

       <!-- 포인트 구매 내역 -->
       <div class="row mt-4">
           <div class="col">
				<h2>
					포인트 구매 내역
					<a href="${pageContext.request.contextPath}/point/charge" title="추가구매">
						<i class="fa-regular fa-credit-card"></i>
					</a>
				</h2>
				<hr>
				<table class="table table-striped mt-2">
					<thead class="text-center">
						<tr>
							<th>번호</th>
							<th>상품명</th>
							<th>수량</th>
							<th>구매금액</th>
							<th>구매일시</th>
						</tr>
					</thead>
					<tbody class="text-center">
						<c:forEach var="buyDto" items="${buyList}">
						<tr>
							<td>${buyDto.buySerial}</td>
							<td>${buyDto.itemName}</td>
							<td>${buyDto.buyQty}</td>
							<td>
								<fmt:formatNumber value="${buyDto.buyTotal}" pattern="#,##0"/>
							</td>
							<td>
								<fmt:formatDate value="${buyDto.buyTime}" 
																pattern="yyyy-MM-dd HH:mm"/>
							</td>
						</tr>		
						</c:forEach>
					</tbody>
				</table>
           </div>
       </div>
	</div>
</div>










<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



