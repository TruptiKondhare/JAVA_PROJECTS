<%@ page import ="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int num=Integer.parseInt(request.getParameter("n"));
int num1=Integer.parseInt(request.getParameter("Ano"));
int num2=Integer.parseInt(request.getParameter("Hno"));
int num3=Integer.parseInt(request.getParameter("Bno"));
Date date =new Date();
%>
<table border="1">
<tr>
<td>Current date and time
<td><%=date %>

<tr>
<td>ID No
<td><%=num %>

<tr>
<td>AC No
<td><%=num1 %>

<tr>
<td>Home No
<td><%=num2 %>

<tr>
<td>Batch no
<td><%=num3 %>
</table>
</body>
</html>