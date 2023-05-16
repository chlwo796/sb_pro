<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/login">
<input type="text" id="uiId" name="uiId" placeholder="아이디를 입력해주세요.">
<input type="password" id="uiPwd" name="uiPwd" placeholder="비밀번호를 입력해주세요.">
<button onclick="return chkIdPwd()">로그인</button>
</form>
<script>
function chkIdPwd(){
	const uiId = document.querySelector('#uiId');
	if(uiId.value.trim().length<4){
		alert('아이디 4글자 이상 입력해주세요.');
		uiId.value = '';
		uiId.focus();
		return false;
	}
	const uiPwd = document.querySelctor('#uiPwd');
	if(uiPwd.value.trim().length<4){
		alert('비밀번호 4글자 이상 입력해주세요.');
		uiPwd.value = '';
		uiPwd.focus();
		return false;
	}
	return true;
}
</script>
</body>
</html>