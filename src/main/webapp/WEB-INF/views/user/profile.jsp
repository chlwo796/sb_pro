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
<h2>프로필보기</h2>
회원번호 : ${user.uiNum}<br>
이름 : ${user.uiName}<br>
생년월일 : ${user.uiBirth}<br>
전화번호 : ${user.uiPhone}<br>
가입일 : ${user.uiCredat} ${user.uiCretim}<br>
</body>
</html>