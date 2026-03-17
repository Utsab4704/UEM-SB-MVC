<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="display:flex; justify-content:center; align-items:center; height:100vh;">
	<form action="login" method ="post">
		<table>
			<tr>
				<td>User : </td>
				<td><input type = "text" name="user" placeholder = "Enter email/username"></input></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type = "password" name="password" placeholder = "Enter password"></input></td>
			</tr>
			<tr>
				<td><input type = "submit" value = "Login"></input></td>
				<td><input type = "reset" value = "Reset"></input></td>
		</table>
	</form>
	
	<br>
	<div style="text-align: center;">
		<a href="register.html">Sign Up</a>
		<br>
		<a href="forgotpassword.html">Forgot Password </a>
	</div>
</body>
</html>