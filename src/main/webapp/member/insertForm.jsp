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
	if("POST".equals(request.getMethod())) {
		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		Member member = new Member(custname, phone, address, grade, city);
		MemberDao memberDao = MemberDao.getInstance();
		memberDao.save(member);
		
		response.sendRedirect("/");
	}		
	%>
 	<form method="POST">
 		<input type="text" name="custname" placeholder="custname" />
 		<input type="text" name="phone" placeholder="phone" />
 		<input type="text" name="address" placeholder="address" />
 		<input type="text" name="grade" placeholder="grade" />
 		<input type="text" name="city" placeholder="city" />
 		<input type="submit" />
 	</form>
 	
</body>
</html>