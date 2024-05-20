<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  
<jsp:useBean id="obj" class="bean.User"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
  
out.print("You are successfully registered");  
  
%>  
 
</body>
</html>