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
<div id = "rDiv">

</div>
<script>
window.onload = async function(){
	let response = fetch('/translate');
	let objJson = await response.json();
	let obj = JSON.parse(objJson);
	console.log(obj);
	document.querySelector('#rDiv').innerHTML += '이름 : ' + obj.name;
	document.querySelector('#rDiv').innerHTML += ' 나이 : ' + obj.age;
}
</script>
</body>
</html>