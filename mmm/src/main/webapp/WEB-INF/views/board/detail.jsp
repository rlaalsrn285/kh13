<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
	.reply-list-wrapper > .reply-item {
		padding-bottom:10px;
		margin-bottom: 10px;
		border-bottom: 1px solid #b2bec3;
	}
</style>
<script type="text/template" id="reply-item-wrapper">
	<div class="reply-item">
		<h3>
			<span class="reply-writer">작성자</span>
			<i class="fa-solid fa-edit blue ms-20 btn-reply-edit"></i>
			<i class="fa-solid fa-trash red btn-reply-delete"></i>
		</h3>
		<pre class="reply-content">댓글 내용</pre>
		<div class="reply-time">yyyy-MM-dd HH:mm:ss</div>
	</div>
</script>
<script type="text/javascript">
	function loadList() {
		//파라미터에서 게시글 번호를 읽는다
		var params = new URLSearchParams(location.search);
		var boardNo = params.get("boardNo");
		
		//페이지 로딩 완료 시 댓글 목록을 불러와서 출력
		$.ajax({
			url:"/rest/reply/list",
			method:"post",
			data: { replyOrigin : boardNo },
			success: function(response) {
				//댓글 개수를 표시
				$(".reply-count").text(response.length);
				
				//기존에 있는 내용을 지우도록 지시
				$(".reply-list-wrapper").empty();//비워라!
				
				//내용을 목록에 출력
				//response는 List<ReplyDto> 형태
				for(var i=0; i < response.length; i++) {
					//template 불러오고
					var templateText = $("#reply-item-wrapper").text();
					var templateHtml = $.parseHTML(templateText);
						
					//정보 출력
					$(templateHtml).find(".reply-writer").text(response[i].replyWriter);
					$(templateHtml).find(".reply-content").text(response[i].replyContent);
					$(templateHtml).find(".reply-time").text(response[i].replyTime);
					
					//화면에 필요한 정보를 추가(ex : 삭제버튼에 번호 설정)
					//- data라는 명령으로는 읽기만 가능
					//- 태그에 글자를 추가하고 싶다면 .attr() 명령 사용
					$(templateHtml).find(".btn-reply-delete")
											.attr("data-reply-no", response[i].replyNo);
					
					//화면에 추가
					$(".reply-list-wrapper").append(templateHtml);
				}								
			}
		});
	}

	$(function(){
		//최초 목록 불러오기
		loadList();
		
		//문서에 댓글 삭제 이벤트 등록
		//- 화면을 지우는 것이 아니라 서버에 지워달라고 요청을 해야 한다
		//- 삭제가 완료되면 화면을 직접 지우지 말고 목록을 다시 불러온다
		$(document).on("click", ".btn-reply-delete", function(){
			var choice = window.confirm("댓글을 삭제하시겠습니까?");
			if(choice == false) return;
			
			//태그에 심어져 있는 번호 정보를 읽어와서 삭제하도록 요청
			var replyNo = $(this).data("reply-no");
			
			$.ajax({
				url: "/rest/reply/delete",
				method: "post",
				data: { replyNo : replyNo },
				success: function(response) {
					loadList();//삭제가 완료되면 목록 불러오기
				}
			});
		});
		
		//문서에 댓글 수정 이벤트 등록
		$(document).on("click", ".btn-reply-edit", function(){});
		$(document).on("click", ".btn-reply-save", function(){});
		$(document).on("click", ".btn-reply-cancel", function(){});
	});
</script>

<c:if test="${sessionScope.loginId != null}">
<script type="text/javascript">
	//좋아요 하트 클릭 이벤트
	$(function(){
		//(주의) 아무리 같은 페이지라도 서로 다른언어를 혼용하지 말것
		//- 자바스크립트에서 파라미터를 읽어 번호를 추출
		var params = new URLSearchParams(location.search);
		var boardNo = params.get("boardNo");
		
		//목표 : 하트를 클릭하면 좋아요 갱신처리
		$(".board-like").find(".fa-heart").click(function(){
			$.ajax({
				url : "/rest/board_like/toggle",//같은 서버이므로 앞 경로 생략
				method : "post",
				data : { boardNo : boardNo },
				success : function(response){
					//console.log(response);
					
					//response.state에 따라서 하트의 형태를 설정
					$(".board-like").find(".fa-heart")
						.removeClass("fa-solid fa-regular")
						.addClass(response.state ? "fa-solid" : "fa-regular");
					
					//response.count에 따라서 좋아요 개수를 표시
					$(".board-like").find(".count").text(response.count);
				}
			});
		});
	});
</script>
</c:if>
<script type="text/javascript">
	//좋아요 최초 불러오기
	$(function(){
		//(주의) 아무리 같은 페이지라도 서로 다른언어를 혼용하지 말것
		//- 자바스크립트에서 파라미터를 읽어 번호를 추출
		var params = new URLSearchParams(location.search);
		var boardNo = params.get("boardNo");
		
		//최초에 표시될 화면을 위해 화면이 로딩되자마자 서버로 비동기통신 시도
		$.ajax({
			url : "/rest/board_like/check",
			method : "post",
			data : { boardNo : boardNo },
			success: function(response) {
				//response.state에 따라서 하트의 형태를 설정
				$(".board-like").find(".fa-heart")
					.removeClass("fa-solid fa-regular")
					.addClass(response.state ? "fa-solid" : "fa-regular");
				
				//response.count에 따라서 좋아요 개수를 표시
				$(".board-like").find(".count").text(response.count);
			}
		});
	});
</script>


<div class="container w-800">
	<div class="cell center">
		<h1>${boardDto.boardNo}번 글 보기</h1>
	</div>
	
	<div class="cell">
		<h2>
			${boardDto.boardTitle}
			
			<%-- (추가) 수정시각 유무에 따라 수정됨 표시 --%>
			<c:if test="${boardDto.boardEtime != null}">
				(수정됨)
			</c:if>
		</h2>
	</div>
	
	<div class="cell">
		<h3>
			<%-- 탈퇴한 사용자일 때와 아닐 때 나오는 정보가 다르게 구현 --%>
			<c:choose>
				<c:when test="${boardDto.boardWriter == null}">
					${boardDto.boardWriterStr}
				</c:when>
				<c:otherwise>
					${memberDto.memberNick}
					(${memberDto.memberLevel})
				</c:otherwise>
			</c:choose>
		</h3>
	</div>
	
	<hr>
	<div class="cell" style="min-height:250px;">
		<%-- 
			HTML은 엔터와 스페이스 등을 무시하기 때문에 textarea와 모양이 달라진다
			- 상용 에디터를 쓰면 알아서 글자를 보정해주기 때문에 문제가 없다
			- 기본 textarea를 쓰면 문제가 발생한다
			- <pre>태그를 사용하면 글자를 있는 그대로 출력한다  
		--%>
		<pre>${boardDto.boardContent}</pre>
	</div>
	
	<hr>
	<div class="cell">
		조회수 ${boardDto.boardReadcount} 

		<span class="board-like red">
			<i class="fa-regular fa-heart"></i>
			<span class="count">?</span>
		</span> 
	</div>
	
	<div class="cell">
		<fmt:formatDate value="${boardDto.boardWtime}" 
									pattern="yyyy-MM-dd HH:mm:ss"/>
	</div>
	
	<div class="cell">
		${boardDto.boardWtimeDiff}
	</div>
	
	<div class="cell right">
		<a class="btn" href="write">글쓰기</a>
		<a class="btn" href="write?boardTarget=${boardDto.boardNo}">답글쓰기</a>
		
		<%-- 
			수정과 삭제 링크는 회원이면서 본인글이거나 관리자일 경우만 출력 
			- 본인글이란 로그인한 사용자 아이디와 게시글 작성자가 같은 경우
			- 관리자란 로그인한 사용자 등급이 '관리자'인 경우
		--%>
		<c:if test="${sessionScope.loginId != null && (sessionScope.loginId == boardDto.boardWriter || sessionScope.loginLevel == '관리자')}">
		<a class="btn negative" href="edit?boardNo=${boardDto.boardNo}">글수정</a>
		<a class="btn negative" href="delete?boardNo=${boardDto.boardNo}">글삭제</a>
		</c:if>
		<a class="btn positive" href="list">글목록</a>
	</div>
	
	
	<!-- 댓글 작성창 + 댓글 목록 -->
	<div class="cell">
		<span class="reply-count">0</span>개의 댓글이 있습니다
	</div>
	<div class="cell reply-list-wrapper"></div>
	<div class="cell">
		댓글작성창
	</div>
	
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



