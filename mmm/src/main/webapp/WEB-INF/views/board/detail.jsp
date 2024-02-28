<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

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


<h1>${boardDto.boardNo}번 글 보기</h1>

<table border="1" width="800">
	<tr>
		<td>
			${boardDto.boardTitle}
			
			<%-- (추가) 수정시각 유무에 따라 수정됨 표시 --%>
			<c:if test="${boardDto.boardEtime != null}">
				(수정됨)
			</c:if>
		</td>
	</tr>
	<tr>
		<td>
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
		</td>	
	</tr>
	<tr height="200" valign="top">
		<td>
			<%-- 
				HTML은 엔터와 스페이스 등을 무시하기 때문에 textarea와 모양이 달라진다
				- 상용 에디터를 쓰면 알아서 글자를 보정해주기 때문에 문제가 없다
				- 기본 textarea를 쓰면 문제가 발생한다
				- <pre>태그를 사용하면 글자를 있는 그대로 출력한다  
			--%>
			<pre>${boardDto.boardContent}</pre>
		</td>
	</tr>
	<tr>
		<td>
			조회수 ${boardDto.boardReadcount} 
			댓글 ?
			
			<span class="board-like red">
				<i class="fa-regular fa-heart"></i>
				<span class="count">?</span>
			</span> 
			<br>
			<fmt:formatDate value="${boardDto.boardWtime}" 
										pattern="yyyy-MM-dd HH:mm:ss"/>
			<br>
			${boardDto.boardWtimeDiff}
		</td>
	</tr>
	<tr>
		<td align="right">
			<a href="write">글쓰기</a>
			<a href="write?boardTarget=${boardDto.boardNo}">답글쓰기</a>
			
			<%-- 
				수정과 삭제 링크는 회원이면서 본인글이거나 관리자일 경우만 출력 
				- 본인글이란 로그인한 사용자 아이디와 게시글 작성자가 같은 경우
				- 관리자란 로그인한 사용자 등급이 '관리자'인 경우
			--%>
			<c:if test="${sessionScope.loginId != null && (sessionScope.loginId == boardDto.boardWriter || sessionScope.loginLevel == '관리자')}">
			<a href="edit?boardNo=${boardDto.boardNo}">글수정</a>
			<a href="delete?boardNo=${boardDto.boardNo}">글삭제</a>
			</c:if>
			<a href="list">글목록</a>
		</td>
	</tr>
</table>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



