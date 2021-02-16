<%@page import="java.util.List"%>
<%@page import="com.jdbc.app.entity.Location"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%List<Location> list =(List<Location>)request.getAttribute("list");
for(Location lo : list){
	  pageContext.setAttribute("lo", lo);
 %>
   
    ${lo.locName}
    <br>
     ${lo.flag}
    <br>
    
    
  
    

<%} %>
    
</body>
</html>