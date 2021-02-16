
<%@page import="com.jdbc.app.entity.Notice"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>																			5  n
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table border=1>
   <%Notice nt=(Notice)request.getAttribute("nt");
   pageContext.setAttribute("n", nt);

   %>
      <tr>
      <td>${n.hit}</td>
      
      <!--  
      <td>${n.id}</td>
      <td>${n.title}</td>
      <td>${n.content}</td>
      <td>${n.writerId}</td>
      <td>${n.regDate}</td>
      -->
      </tr>
      
      </table>
</body>
</html>