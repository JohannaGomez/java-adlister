<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome" />
    </jsp:include>
</head>

<body>

    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1 style="text-align: center">Welcome to Adlister application!!</h1>
    </div>
    <%--<jsp:include page="login.jsp" />--%>

    <%--<c:if test="true">--%>
        <%--<h1>Variable names should be very descriptive</h1>--%>
    <%--</c:if>--%>
    <%--<c:if test="false">--%>
        <%--<h1>single letter variable names are good</h1>--%>
    <%--</c:if>--%>
</body>
</html>

<%-------------------------------------------jsp-jstl lecture--------------------------------------------------------%>
<%--Created by IntelliJ IDEA.--%>
<%--User: fer--%>
<%--Date: 12/18/17--%>
<%--Time: 3:24 PM--%>
<%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%! int[] numbers = {1,5,10,15}; %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<p>Query String: <%= request.getQueryString() %></p>--%>

<%--&lt;%&ndash; Using conditions &ndash;%&gt;--%>

<%--<c:if test="${param.name == 'Fer'}">--%>
    <%--<p>"name" parameter: <%= request.getParameter("name") %></p>--%>
    <%--<p>"name" parameter: ${param.name}</p>--%>
<%--</c:if>--%>

<%--&lt;%&ndash; Using for each&ndash;%&gt;--%>

<%--List numbers--%>
<%--<ul>--%>
    <%--<c:forEach var="number" items="<%= numbers%>">--%>
        <%--<li>${number}</li>--%>
    <%--</c:forEach>--%>
<%--</ul>--%>

<%--<p>"page_no" parameter: ${param.page_no}</p>--%>
<%--<p>"age" parameter: <%= request.getParameter("age") %></p>--%>
<%--<p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>

<%--</body>--%>
<%--</html>--%>
