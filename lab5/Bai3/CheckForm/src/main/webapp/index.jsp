<%@ page import="org.example.model.User" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<%--    <%--%>
<%--        Object user = request.getSession().getAttribute("auth");--%>
<%--        if (user == null) {--%>
<%--    %>--%>
<%--    <h1>chua dang nhap</h1>--%>
<%--    <%--%>
<%--        else {--%>
<%--    %>--%>
<%--    <h1>Xin chao <%= user.getUsername()%> </h1>--%>
<%--    <%--%>
<%--        {--%>
<%--    %>--%>
<c:if test="${auth == null}">
    <h1>chua dang nhap</h1>
</c:if>
<c:if test="${auth != null}">
    <h1>Xin chao ${auth.username}</h1>
</c:if>

<%--    <h1>Xin chao <%= (user == null) ? "chua dang nhap" : user.getUsername()%> ></h1>--%>
    <a class="sign-up"  href="<c:url value="/logout"/>">Logout</a>
</body>
</html>