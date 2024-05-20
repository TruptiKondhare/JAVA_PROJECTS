<%@ page import ="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Display date with page directive
</h1>
<% Date date =new Date(); %>
<table border="1">
<tr>
<td>Current date and time
<td><%=date %>
</table>

</body>
</html>
