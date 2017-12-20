<%--
  Created by IntelliJ IDEA.
  User: paomac
  Date: 12/20/17
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Create a file ads/index.jsp. This file will show a listing of all the ads on your site.--%>
<%--This page should be available when a user visits /ads.--%>
<%--Use the all method on the AdsDao class to get a listing of all the ads, and pass this on to your jsp file--%>
<%--In your jsp file, loop through all the ads and display each one.--%>

<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/partials/navbar.jsp" />
    <div class="container">
        <h1>Ads index lister!!</h1>

        <c:forEach var="pao" items="${ads}">
            <h1>${pao.title}</h1>
            <p>${pao.description}</p>
        </c:forEach>
    </div>
</body>
</html>
