/*
    페이지 이탈 방지 처리 라이브러리
    다음 두 가지 유형을 제외한 모든 이탈을 방지
    - <form>에 .free-pass가 붙은 경우
    - <a>에 .free-pass가 붙은 경우
*/

$(function(){
    //창에 beforeunload 이벤트 설정
    $(window).on("beforeunload", function(){
        return false;
    });

    //<form>에 .free-pass가 붙어있으면 submit 시 beforeunload 제거
    $("form.free-pass").submit(function(){
        $(window).off("beforeunload");
        return true;
    });    
    //<a>에 .free-pass가 붙어있으면 click 시 beforeunload 제거
    $("a.free-pass").click(function(){
        $(window).off("beforeunload");
        return true;
    });
});