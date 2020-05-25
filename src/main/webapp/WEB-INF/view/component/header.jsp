<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<header class="header mb-5">
    </div>
    <nav class="navbar navbar-expand-lg">
        <div class="container"><a href="index.html" class="navbar-brand home"><img src="img/logo.png" alt="Obaju logo" class="d-none d-md-inline-block"><img src="img/logo-small.png" alt="Obaju logo" class="d-inline-block d-md-none"><span class="sr-only">Obaju - go to homepage</span></a>
            <div class="navbar-buttons">
                <button type="button" data-toggle="collapse" data-target="#navigation" class="btn btn-outline-secondary navbar-toggler"><span class="sr-only">Toggle navigation</span><i class="fa fa-align-justify"></i></button>
                <button type="button" data-toggle="collapse" data-target="#search" class="btn btn-outline-secondary navbar-toggler"><span class="sr-only">Toggle search</span><i class="fa fa-search"></i></button><a href="/logout" class="btn btn-outline-secondary navbar-toggler"><i class="fa fa-sign-out"></i></a>
            </div>
            <div id="navigation" class="collapse navbar-collapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item"><a href="#" class="nav-link active">Home</a></li>

                </ul>
                <div class="navbar-buttons d-flex justify-content-end">
                    <div id="profile" class="navbar-collapse collapse d-none d-lg-block">
                        <sec:authorize access="isAuthenticated()">
                            <a href="#">
                                ${sessionScope.loggedUser.firstName} ${sessionScope.loggedUser.lastName} ( <sec:authentication property="principal.username" /> )
                            </a>
                        </sec:authorize>

                    </div>
                    <!-- /.nav-collapse-->
                    <div id="search-modified" class="navbar-collapse collapse d-none d-lg-block">
                        <div class="container">
                            <form role="search" class="ml-auto">
                                <div class="input-group">
                                    <input type="text" placeholder="Search" class="form-control">
                                    <div class="input-group-append">
                                        <button type="button" class="btn btn-primary"><i class="fa fa-search"></i></button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div id="logout" class="navbar-collapse collapse d-none d-lg-block"><a href="/logout" class="btn btn-primary navbar-btn"><i class="fa fa-sign-out"></i><span>Logout</span></a></div>
                </div>
            </div>
        </div>
    </nav>
    <div id="search" class="collapse">
        <div class="container">
            <form role="search" class="ml-auto">
                <div class="input-group">
                    <input type="text" placeholder="Search" class="form-control">
                    <div class="input-group-append">
                        <button type="button" class="btn btn-primary"><i class="fa fa-search"></i></button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</header>