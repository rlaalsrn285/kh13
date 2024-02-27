<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<form action="join" method="post" enctype="multipart/form-data" autocomplete="off">

<div class="container w-500">
	<div class="cell center"><h1>회원 정보 입력</h1></div>
	
	<div class="cell">
		<div class="progressbar">
		<div class="guage">
		
		</div>
		</div>
	</div>
	
	<!-- 1페이지 - 아이디/비밀번호 -->
	<div class="cell page">
		<div class="cell">
			<label>아이디<b style="color:red">*</b></label>
			<input type="text" name="memberId" placeholder="소문자 시작, 숫자 포함 8~20자" required class="tool w-100">
		</div>
		<div class="cell">
			<label>비밀번호<b style="color:red">*</b></label>
			<input type="password" name="memberPw" placeholder="대소문자,숫자,특수문자 포함 6~15자" required class="tool w-100">
		</div>	
		
		<div class="flex-cell">
			<div class="w-100 right">
				<button type="button" class="btn btn-next">다음</button>
			</div>
		</div>
	</div>
	
	<div class="cell page">
		<div class="cell">
			<label>닉네임<b style="color:red">*</b></label>
			<input type="text" name="memberNick" placeholder="한글숫자 2~10자" required class="tool w-100">
		</div>
		
		<div class="flex-cell">
			<div class="w-100 left">
				<button type="button" class="btn btn-prev">이전</button>
			</div>
			<div class="w-100 right">
				<button type="button" class="btn btn-next">다음</button>
			</div>
		</div>
	</div>
	
	<div class="cell page">
		<div class="cell">
			<label>이메일<b style="color:red">*</b></label>
			<input type="email" name="memberEmail" required class="tool w-100">
		</div>
		<div class="cell">
			<label>생년월일</label>
			<input type="date" name="memberBirth" class="tool w-100">
		</div>
		<div class="cell">
			<label>휴대전화</label>
			<input type="tel" name="memberContact" class="tool w-100">
		</div>
		
		<!-- 
			버튼이 없는 경우도 처리하기 위해서 flex-cell 사용
			flex-cell은 설정에 따라 줄바꿈을 금지할 수 있기 때문에 폭을 100%로 설정	 
		-->
		<div class="flex-cell">
			<div class="w-100 left">
				<button type="button" class="btn btn-prev">이전</button>
			</div>
			<div class="w-100 right">
				<button type="button" class="btn btn-next">다음</button>
			</div>
		</div>
	</div>
	
	<div class="cell page">
		<div class="cell">
			<label>주소</label>
		</div>
		<div class="cell">
			<input type="text" name="memberPost" placeholder="우편번호" class="tool" size="8">
			<button type="button" class="btn">검색</button>    
		</div>
		<div class="cell">
			<input type="text" name="memberAddress1" placeholder="기본주소" class="tool w-100">
		</div>
		<div class="cell">
			<input type="text" name="memberAddress2" placeholder="상세주소" class="tool w-100">
		</div>
		
		<div class="flex-cell">
			<div class="w-100 left">
				<button type="button" class="btn btn-prev">이전</button>
			</div>
			<div class="w-100 right">
				<button type="button" class="btn btn-next">다음</button>
			</div>
		</div>
	</div>
	
	<div class="cell page">
		<div class="cell">
			<label>프로필 이미지</label>
			<input type="file" name="attach" class="tool w-100">
		</div>
		
		<div class="flex-cell">
			<div class="w-100 left">
				<button type="button" class="btn btn-prev">이전</button>
			</div>
			<div class="w-100 right">
				<button type="submit" class="btn positive">회원가입</button>
			</div>
		</div>
	</div>
	
	
</div>

	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>