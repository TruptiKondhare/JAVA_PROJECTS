<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Search string in google with response.sendRedirect.....</h1>
<%
String searchstr=request.getParameter("SearchStr");
String url="http://www.google.co.in/search?q="+searchstr;
response.sendRedirect(url);
%>

</body>
</html>