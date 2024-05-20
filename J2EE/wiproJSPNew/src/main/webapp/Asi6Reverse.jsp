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

int reverse=0;
int num=Integer.parseInt(request.getParameter("n"));
for(;num!=0;num=num/10)
{
	int remainder=num%10;
	reverse=reverse*10+remainder;	
}
	
out.println("Reverse of number is: "+reverse);
	

%>
</form>
</body>
</html>