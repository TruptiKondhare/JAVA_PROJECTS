<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Implicit Object</h1>
<form>
Enter Your Name:<input type=" text" name="name"/>
<input type="submit">
</form>
<br>
<%
String name=request.getParameter("name");
out.println("");
out.println("Given name is: "+name);
%>

</body>
</html>