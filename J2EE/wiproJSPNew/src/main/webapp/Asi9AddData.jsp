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
int id=Integer.getInteger("ID");

String name=request.getParameter("Name");
String dept=request.getParameter("Deptm");
String desig=request.getParameter("Desig");
if( id !=0 && name!=null && dept!=null && desig!=null );
{
	out.println("Valid Emp Data");}

%>

Enter Id=<input  type="text" name="ID">
Enter name=<input  type="text" name="Name">
Enter Department =<input  type="text" name="Dept">
Enter designation=<input  type="text" name="Desig">

</form>
</body>
</html>