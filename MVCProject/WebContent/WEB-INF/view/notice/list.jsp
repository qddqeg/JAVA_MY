
<%@page import="com.jdbc.app.entity.Notice"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>	
	<select name="f">
		<option ${(param.f == "title")?"selected":""} value = "title">제목</option>
		<option ${(param.f == "writer_id")?"selected":""} value = "writer_id">글쓴이</option>
	</select>
	<label>검색어</label>
	<input type ="text" name="q" value = "${param.q}"/>
	<input type = "submit" value = "Search"/>
	<!-- 관리자 모드 -->
	<input type="button" onclick="location.href='/MVCProject/admin/board/notice/index'" value="관리자 메뉴">
</form>
	<table border=1>

		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성내용</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<%-- 
		<%List<Notice> list =(List<Notice>)request.getAttribute("list");
      for(Notice nt : list){
    	  pageContext.setAttribute("n", nt);

   %>
   --%>
		<c:forEach var="n" items="${list}" varStatus="t">
			<tr>
				<td>${n.id}</td>
				<td><a href="detail?id=${n.id}&p=${param.p}&f=${param.f}&q=${param.q}">${n.title}</a></td>
				<td>${n.content}</td>
				<td>${n.writerId}</td>
				<td>
					<fmt:formatDate pattern="yyyy.MM.dd." value="${n.regDate}"></fmt:formatDate>
				</td>
				<td>
					<fmt:formatNumber type="number" pattern="###,###" value="${n.hit}"></fmt:formatNumber>
				</td>

			</tr>
		</c:forEach>
		<%--<%}%>--%>
	</table>
	
	<!-- startnum 변수 선언 및 값 할당 -->
	<c:set var="page" value="${empty param?1:param.p}"></c:set>
	<c:set var="startNum" value="${page-(page-1)%5}"></c:set>
		<c:set var="lastNum" value ="${fn:substringBefore(Math.ceil(count/10), '.')}"></c:set>
	
	
	
	<!-- 현재 페이지 -->
		<div>
			<h3> 현재 페이지 </h3>
			<div><span>${empty param?1:param.p}</span>/${lastNum} pages</div>
		
		</div>
	<!-- 페이지 이동 -->
	
	
	<!-- Prev 버튼-->
		<c:if test="${startNum > 1}">
			<a href="?p=${startNum-1}&f=&q=">Prev</a>
		</c:if>
		<c:if test="${startNum <= 1}">
			<a href="#" onclick="alert('첫번째 페이지입니다.');">Prev</a>
		</c:if>
	
	
	
		<c:forEach var="i" begin="0" end="4">
			<c:if test="${param.p == (startNum+i)}">
				<c:set var="style" value="font-weight: bold; color :red;"></c:set>
			</c:if>
			<c:if test="${param.p != (startNum+i)}">
				<c:set var="style" value="" />
			</c:if>
			<a style ="${style}" href="?p=${startNum+i}&f=${param.f}&q=${param.q}">${startNum+i}</a>
			
		</c:forEach>
	
	
	<!-- next 버튼-->
		<c:if test="${startNum+5 <= lastNum}">
			<a href="?p=${startNum+5}&t=&q=">Next</a>
		</c:if>
		<c:if test="${startNum+5 > lastNum}">
			<a href="#" onclick="alert('마지막 페이지입니다.');">Next</a>
		</c:if>
</body>
</html>