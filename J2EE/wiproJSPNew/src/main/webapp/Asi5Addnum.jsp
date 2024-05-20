<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<%
int number=Integer.parseInt(request.getParameter("num"));
int sum;
for(sum=0;number!=0;number=number/10){
	sum=sum+number%10;
	
}
out.println("Sum of digits: "+sum);
%>
</form>

</body>
</html>