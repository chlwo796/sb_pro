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
<form action="/boards" method="GET">
<input type="text" id = "biTitle" name="biTitle" placeholder="검색할 제목을 작성해주세요" value="${param.biTitle}">
<input type="text" name = "uiName" placeholder="검색할 이름을 작성해주세요." value="${param.uiName}">
<button>검색</button>
</form>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">글쓴이</th>
				<th scope="col">작성일</th>
				<th scope="col">조회수</th>
			</tr>
		<tbody>
			<c:if test="${empty page.list}">
				<tr>
					<th colspan="5">게시물이 없습니다.</th>
				</tr>
			</c:if>
			<c:forEach items="${page.list}" var="board">
				<tr>
					<th scope="row">${board.biNum}</th>
					<th scope="row"><a href="/board?biNum=${board.biNum}">${board.biTitle}</a></th>
					<th scope="row">${board.uiName}</th>
					<th scope="row">${board.biCredat}</th>
					<th scope="row">${board.biCnt}</th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div id="pageDiv"
		style="font-weight: bold; text-align: center; font-size: 14px;">

	</div>
	<c:if test="${!(empty page.list)}">
		<script>
			const searchName = document.querySelector('#biTitle').value;
			const pages = ${page.pages};
			const page = ${page.pageNum};
			const start = Math.floor((page - 1) / 10) * 10 + 1;
			const end = (start + 9) > pages ? pages : (start + 9);
			let html = '';
			
			if (start != 1) {
				if (page > start) {
					html += '<a href="/boards?page=' + (start - 1) + 'biTitle=' + searchName + '">&#x25c0</a>';
				}else{
				html += '<a href="/boards?page=' + (page - 1) + 'biTitle=' + searchName + '">&#x25c0</a>';
				}
			}
	

			//const isPre = ${page.hasPreviousPage};
			//const isNext = ${page.hasNextPage};
			for (let i = start; i <= end; i++) {
				if (i == page) {
					html += ' [' + i + '] ';
				} else {
					html += ' <a href="/boards?page=' + i + '&biTitle=' + searchName + '">[' + i + ']</a> ';
				}
			}
			if (end != pages) {
				if(page < end){
					html += '<a href="/boards?page=' + (end + 1) + '&biTitle=' + searchName + '">&#9654</a>';
				}else{
				html += '<a href="/boards?page=' + (page + 1) + '&biTitle=' + searchName + '">&#9654</a>';
				}
			}
			document.querySelector('#pageDiv').innerHTML = html;
		</script>
	</c:if>
</body>
</html>