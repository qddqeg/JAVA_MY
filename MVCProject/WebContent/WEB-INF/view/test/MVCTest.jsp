<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%pageContext.setAttribute("a", "페이지값 변경/pageScope"); %>
</head>
<body>
     1. <%=request.getAttribute("a") %>
     <br>
     2. ${requestScope.a}
     <br>
     2-1. ${pageScope.a}
     <br>
     3. ${b} 
     <br>
     4. ${b<15?'15보다 작습니다' :b} 
     <br>
     5. ${b == null || b == ""} 
     <br>
     6. ${empty b?'값이 없습니다.':'값이 있습니다.'} 
     <br>
 </body>
</html>