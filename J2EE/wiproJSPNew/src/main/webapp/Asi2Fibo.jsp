<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num=Integer.parseInt(request.getParameter("n"));

int a=0,b=1,c;

for (int i=2;i<=num;i++){
	c=a+b;
	a=b;
	b=c;
}
out.println("Fibonacci number is : "+b);

%>

</body>
</html>