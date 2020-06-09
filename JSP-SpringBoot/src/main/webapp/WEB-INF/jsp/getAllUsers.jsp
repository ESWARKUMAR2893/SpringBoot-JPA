<html>

<body>
<%@ page import="java.util.List" %>
<%@ page import="com.springboot.webjsp.entity.User" %>


<table border="1">
		<thead>
			<tr>
				<th>Id </th>
				<th>Email Id &npsp; </th>
				<th>First Name &npsp; </th>
				<th>Last Name &npsp; </th>
			</tr>
		</thead>
		<tbody>
			<%
				int i = 1;
				List<User> list = (List) request.getAttribute("User");
			%>
			<%
				for (User u : list) {
			%>
			<tr>
				<td><%=u.getId()%> </td>
				<td><%=u.getEmail() %> </td>
				<td><%=u.getFirstname()%> </td>
				<td><%=u.getLastname()%> </td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>

</html>