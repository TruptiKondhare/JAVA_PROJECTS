<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<%!
int factorial (int n){
	int fact =1;
	for (int i=1;i<=n;i++)
		fact=fact*i;
	return fact;
	
}
%>
<%
int result=factorial(5);
out.println("Factorial of 5 is: "+result);
%>
</h1>

</body>
</html>