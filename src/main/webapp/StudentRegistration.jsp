<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<h1><center>Student Registration Form</center></h1>
<form action="process.jsp">
<table border="1">
<tr>
<th>Admission Number</th><td><input type="text" name="adno"></td>
</tr>
<tr>
<th>First Name</th><td><input type="text" name="fname"></td>
</tr>
<tr>
<th>Last Name</th><td><input type="text" name="lname"></td>
</tr>
<tr>
<th>Father Name</th><td><input type="text" name="fathername"></td>
</tr>
<tr>
<th>Mother Name</th><td><input type="text" name="mothername"></td>
</tr>
<tr>
<th>Class</th><td><input type="text" name="classname"></td>
</tr>
<tr>
<th>Roll No</th><td><input type="text" name="rollno"></td>
</tr>
<tr>
<th>Section</th><td><input type="text" name="section"></td>
</tr>
<tr>
<th>Address</th><td><input type="text" name="address"></td>
</tr>
<tr>
<th colspan="2"><input type="submit" value="Submit" name="processData"></th>
</tr>
</table>
</form>
</body>
</html>