<%@page import="java.util.List"%>
<%@page import="webExpress.member.MemberDao"%>
<%@page import="webExpress.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	MemberDao memberDao = MemberDao.getInstance();
	List<Member> members = memberDao.findAll();
	%>
	
	<h1>회원 리스트</h1>
	<table>
		<thead>
			<tr>
				<th>custno</th>
				<th>custname</th>
				<th>phone</th>
				<th>address</th>
				<th>joindate</th>
				<th>grade</th>
				<th>city</th>
			</tr>
		</thead>
		<tbody>
			<%
			for(Member m : members) {
				%>
				<tr>
					<td><%=m.getCustno() %></td>
					<td><%=m.getCustname() %></td>
					<td><%=m.getPhone() %></td>
					<td><%=m.getAddress() %></td>
					<td><%=m.getJoindate() %></td>
					<td><%=m.getGrade() %></td>
					<td><%=m.getCity() %></td>
				</tr>
				<%
			}
			%>
		</tbody>
	</table>
	<a href="/">돌아가기</a>
 	
</body>
</html>