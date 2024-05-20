<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Including html page  using include directive</h1>
<%! int i=10;
String name="Trupti";
String getString(){
	return "Learning JSP";
}
%>
<table>
<tr>
<td>Integer Value
<td><%=i %>
<tr>
<td>String Value
<td><%=name %>
<tr>
<td>Return from Stirng..
<td><%=getString() %>
</table>
<%@ include file="include.html" %>
</body>
</html>