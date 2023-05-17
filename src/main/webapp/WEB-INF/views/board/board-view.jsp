<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<table align = "center">
		<tr>
			<th>번호</th>
			<td>${board.biNum}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.biCnt}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.uiName}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.biTitle}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${board.biContent}</td>
		</tr>
	</table>
	<button type = "button" onclick = "location.href='/board-update'">수정하기</button>
</body>
</html>