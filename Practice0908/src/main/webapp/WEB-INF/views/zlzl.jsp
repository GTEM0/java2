<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="zlzl.zlzl" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
ArrayList<zlzl> list = (ArrayList<zlzl>)request.getAttribute("list");
%>

<%
for(zlzl l : list){
	out.println(l + "<br>");
}
%>
</body>
</html>