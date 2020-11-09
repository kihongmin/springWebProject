/*
	Introspect by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
*/

(function($) {


	skel.breakpoints({
		xlarge:	'(max-width: 1680px)',
		large:	'(max-width: 1280px)',
		medium:	'(max-width: 980px)',
		small:	'(max-width: 736px)',
		xsmall:	'(max-width: 480px)'
	});

	$(function() {

		var	$window = $(window),
			$body = $('body');

		// Disable animations/transitions until the page has loaded.
			$body.addClass('is-loading');

			$window.on('load', function() {
				window.setTimeout(function() {
					$body.removeClass('is-loading');
				}, 100);
			});

		// Fix: Placeholder polyfill.
			$('form').placeholder();

		// Prioritize "important" elements on medium.
			skel.on('+medium -medium', function() {
				$.prioritize(
					'.important\\28 medium\\29',
					skel.breakpoint('medium').active
				);
			});

		// Off-Canvas Navigation.

			// Navigation Panel Toggle.
				$('<a href="#navPanel" class="navPanelToggle"></a>')
					.appendTo($body);

			// Navigation Panel.
				$(
					'<div id="navPanel">' +
						$('#nav').html() +
						'<a href="#navPanel" class="close"></a>' +
					'</div>'
				)
					.appendTo($body)
					.panel({
						delay: 500,
						hideOnClick: true,
						hideOnSwipe: true,
						resetScroll: true,
						resetForms: true,
						side: 'left'
					});

			// Fix: Remove transitions on WP<10 (poor/buggy performance).
				if (skel.vars.os == 'wp' && skel.vars.osVersion < 10)
					$('#navPanel')
						.css('transition', 'none');

	});
	
/* 현아가 추가한 부분 */


$("#loginBtn").click(function(){
	var login = false;
	var userid = $("#id").val();
	var userpw = $("#password").val();
	
	if($('#id').val().length==0){
		alert('아이디를 확인해주세요');
		$('#id').focus();
		return false;
	}
	if($('#password').val().length==0){
		alert('패스워드를 확인해주세요');
		$('#password').focus();
		return false;
	}




});


$("#btn_signup").click(function(){
	var id = $("#id").val();
	var password = $("#password").val();
	var name = $("#name").val();
	var birth = $("#birth").val();
	var phone = $("#phone").val();
	var email = $("#email").val();
	var address = $("#address").val();
	
		if($('#id').val().length==0){
		alert('아이디를 입력해주세요');
		$('#id').focus();
		return false;
	}
	if($('#password').val().length==0){
		alert('패스워드를 입력해주세요');
		$('#password').focus();
		return false;
	}
	if($('#name').val().length==0){
		alert('이름을 입력해주세요');
		$('#name').focus();
		return false;
	}
	if($('#birth').val().length==0){
		alert('생년월일을 입력해주세요');
		$('#birth').focus();
		return false;
	}
	if($('#phone').val().length==0){
		alert('전화번호를 입력해주세요');
		$('#phone').focus();
		return false;
	}
	if($('#email').val().length==0){
		alert('이메일을 입력해주세요');
		$('#email').focus();
		return false;
	}
	if($('#address').val().length==0){
		alert('주소를 입력해주세요');
		$('#address').focus();
		return false;
	}

});


$("#mypage_btn_logout").click(function(){
	alert("로그아웃 되었습니다");

});
$("#nav_btn_logout").click(function(){
	alert("로그아웃 되었습니다");

});


$("#edit_mypage_btn_ok").click(function(){
	alert("수정되었습니다");
});

$("#mypage_btn_quit").click(function(){
	if(confirm("정말 탈퇴하시겠습니까?")){
		alert("탈퇴되었습니다");
	}else{
		location.href="mypage.html";
	}
});

})(jQuery);