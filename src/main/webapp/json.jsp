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
<h2>JSON</h2>
<script>
// 형식 그대로 가야 json형식이다. " "
// 숫자타입그대로 주거나 String형식으로 준다.(선택사항)
	let str = '{"name":"test", "age":10}';
	alert(str);
	let obj = JSON.parse(str);
	alert(obj);
	alert(obj.name);
	alert(obj.age);
	let objStr = JSON.stringify(obj);
	alert(objStr);
</script>
</body>
</html>