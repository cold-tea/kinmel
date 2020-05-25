<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Kinmel - Error</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">

    <!-- *** STYLESHEET START ***-->
    <jsp:include page="component/stylesheets.jsp" />
    <!-- *** STYLESHEET END ***-->
</head>

<body>
    <!-- *** HEADER START ***-->
    <jsp:include page="component/logo-only-header.jsp" />
    <!-- *** HEADER END ***-->

    <!-- *** BODY START ***-->
    <div id="all" class="get-top-margin">
        <div id="content">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="box">
                            <h1 class="display-4">Error</h1>
                            <p class="lead">Some internal error occurred while performing this request. Please try again!!</p>
                            <hr class="my-4">
                            <p>${message}</p>
                            <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/home" role="button">Home</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- *** BODY END ***-->


    <!-- *** FOOTER START ***-->

    <!-- *** FOOTER END ***-->


    <!-- *** COPYRIGHT START ***-->

    <!-- *** COPYRIGHT END ***-->

    <!-- *** JAVASCRIPT START ***-->

    <!-- *** JAVASCRIPT END ***-->
</body>
</body>
</html>
