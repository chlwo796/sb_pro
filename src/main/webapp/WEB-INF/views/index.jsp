<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${user==null}">
		<a href="/login">로그인</a>
		<a href="/join">회원가입</a>
	</c:if>
	<c:if test="${user != null}">
${user.uiName}님 반갑습니다.<br>
	</c:if>
	<ul>
		<li><a href="/logout">로그아웃</a></li>
		<li><a href="/profile">프로필</a></li>
		<li><a href="/boards">게시판</a></li>
		
	</ul>
</body>
</html>