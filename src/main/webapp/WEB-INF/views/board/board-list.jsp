<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<%@ include file="/WEB-INF/views/common/head.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class = "table">
		<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">글쓴이</th>
				<th scope="col">작성일</th>
				<th scope="col">조회수</th>
			</tr>
		<tbody>
			<c:forEach items="${page.list}" var="board">
				<tr>
					<th scope="row">${board.biNum}</th>
					<th scope="row">${board.biTitle}</th>
					<th scope="row">${board.uiNum}</th>
					<th scope="row">${board.biCredat}</th>
					<th scope="row">${board.biCnt}</th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>