<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password</title>
</head>
<body style="display:flex; justify-content:center; align-items:center; height:100vh;">

<h2>Reset Password</h2>

<form action="resetpassword" method="post">

<input type="hidden" name="email" value="${email}">


<table>

<tr>
<td>New Password :</td>
<td>
<input type="password" name="password" required>
</td>
</tr>

<tr>
<td>Confirm Password :</td>
<td>
<input type="password" name="confirmpassword" required>
</td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Reset Password">
</td>
</tr>

</table>
</form>

<br>
<a href="login.jsp">Back to Login</a>

</body>
</html>