<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Given number is odd or even using request implicit object</h1>

<form>
Enter a number:<input type="text" name="num">
<input type="submit">
<br>
<%
if(request.getParameter("num")!=null){
	int num=Integer.parseInt(request.getParameter("num"));
	if (num % 2 == 0)
		out.println("Giver number is even...");
	else
		out.println("Given number is odd");
}
%>
</form>
</body>
</html>