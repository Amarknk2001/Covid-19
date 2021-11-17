	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body bgcolor="cyan">



<h1 align="center">Login Page</h1>

<hr>



<form action="/AdminDashboard" method="post" modelattribute="LoginData">
<h5 style="color:red ">${err}</h5>
Enter Username : <input type="text" name="username" path="username"/> 
<br><br>

Enter Password : <input type="password" name="password" path="password"/> <br><br>



<input type="submit"  value="Login" >

</form>

</body>
</html>