<%--Create separate files for the common elements of your website that appear on every page
(for example, a navbar or your css style sheets) inside the partials directory.--%>



    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/index.jsp.jsp">Adlister</a></li>

                </ul>
                <%--<form class="navbar-form navbar-left">--%>
                    <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<input type="text" class="form-control" placeholder="Zip code">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                    <%--<button type="submit" class="btn btn-default">Search Ads near you</button>--%>
                <%--</form>--%>
                <div class="col-xs-push-2 navbar-right">
                    <button type="submit" class="btn btn-default"><a href="/login.jsp">Login<span class="glyphicon glyphicon-user" aria-hidden="true"></span></a></button>
                </div>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

