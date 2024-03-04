<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 리스트 데이터 설정 --%>
    <%
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        request.setAttribute("fruitsList", fruits);	
    %>

    <h1>Fruit List</h1>

    <%-- 리스트 데이터 반복 출력 --%>
    <c:forEach var="fruit" items="${fruitsList}">
        <c:if test="${not empty fruit}">
            <p>${fruit}</p>
        </c:if>
    </c:forEach>
</body>
</html>