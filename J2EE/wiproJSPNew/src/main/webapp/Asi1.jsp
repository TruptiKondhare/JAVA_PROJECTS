<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Factorial</h1>
<form action="Asi1.jsp" method="post">
Enter a number :<input type="number" name ="number" required ><br>
<input type ="submit" value="Calcutate Factorial">

<%!
long calfact(int i){
	if (i==0 || i==1)
return 1;
	else 
		return i* calfact (i-1);
}
%>
<% 
if (request.getMethod().equals("POST")) {
        int number = Integer.parseInt(request.getParameter("number"));
        if(number<0){
        	%>
        	<p>Enter non negative</p>
        	<%
            }else{
            long factorial=calfact(number);
            %>
            <p>Factorial of <%=number %> is <%=factorial %></p>
            <% 
        }
}
%>

</form>
</body>
</html>