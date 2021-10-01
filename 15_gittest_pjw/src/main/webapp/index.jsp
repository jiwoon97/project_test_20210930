<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>하이요</title>
</head>
<body>
<h1>하이요</h1>
<%
for(int i=0;i<10;i++){
	System.out.println(i+"박");
}
%>
</body>
</html>