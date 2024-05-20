<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Random rand=new Random();
int n=rand.nextInt();
out.println("Randum no is : "+n);
 
%>
<%@ include file="test.html" %>
</body>
</html>