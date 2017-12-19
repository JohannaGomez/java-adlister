<%--
  Created by IntelliJ IDEA.
  User: paomac
  Date: 12/19/17
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if ("POST".equalsIgnoreCase(request.getMethod())) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
// if the request method is POST
    // if the username is admin and the password is "password"
        // redirect to the profile page


%>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="login" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <div class="container">
        <h1 style="text-align: center">Please Log In :) </h1>
            <form class="form-horizontal" method="POST" action="/login.jsp">
                <div class = "form-group">
                    <label for="user" class="col-sm-2">UserName</label>
                    <div class="col-sm-10">
                        <input id="user" type="text" class="form-control" name="username" placeholder="Enter user">
                    </div>
                </div>

                <div class = "form-group">
                    <label for="password" class="col-sm-2">Password</label>
                    <div class="col-sm-10">
                        <input id="password" type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                </div>

                <div class = "form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                </div>


                <%--<c:if test="${boolean_expression}"></c:if>--%>

            </form>
    </div>
</body>
</html>
