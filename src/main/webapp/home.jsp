<%@page import="com.capgemini.training.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="display:flex; justify-content:center; align-items:center; height:100vh;">
	<%
		List<Employee> listOfEmp = (List<Employee>) request.getAttribute("emplist");
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Emp Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Contact No</th>
			<th>City</th>
			</tr>
				<% for(Employee emp: listOfEmp){ %>
			<tr>
				<th><%=emp.getId() %></th>
				<th><%=emp.getEmpId() %></th>
				<th><%=emp.getEmpName() %></th>
				<th><%=emp.getEmpEmail() %></th>
				<th><%=emp.getEmpContactNo() %></th>
				<th><%=emp.getEmpCity() %></th>			
			</tr>
	<%} %>
		</table>
		<br>
</body>
<a href="register_emp.jsp">Add Employee</a>
</html>