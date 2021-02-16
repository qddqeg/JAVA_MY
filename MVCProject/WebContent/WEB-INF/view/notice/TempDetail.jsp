<%@page import="java.util.List"%>
<%@page import="com.jdbc.app.entity.Temp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border =1>
<tr>
     <td><%="날짜"%></td>
     <td><%="온도"%></td>
     <td><%="지역번호" %></td>
     <td><%="직원 아이디" %></td>
     </tr>
<%List<Temp> list =(List<Temp>)request.getAttribute("list");
for(Temp tm : list){
      pageContext.setAttribute("tm", tm);    
      %>
    
     <tr>
       <td>${tm.date}</td>
       <td>${tm.temp}</td>
       <td>${tm.locID}</td>
       <td>${tm.writer}</td>
     </tr>
     
     
     
       

<%}%>
</table>

</body>
</html>