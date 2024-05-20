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
Enter number:<input type="text" name="n"><input type="submit" />


<%

int sum;
if(request.getParameter("n")!=null){
	int num=Integer.parseInt(request.getParameter("n"));
	sum=num*(num+1)/2;
	
	out.println("\n Sum of n  numbers "+sum);
	}

%>
</body>
</html>