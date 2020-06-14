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
    <title>Kinmel - Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">

    <!-- *** STYLESHEET START ***-->
    <jsp:include page="component/stylesheets.jsp" />
    <!-- *** STYLESHEET END ***-->
</head>

<body>
    <!-- *** HEADER START ***-->
    <jsp:include page="component/header.jsp" />
    <!-- *** HEADER END ***-->

    <!-- *** BODY START ***-->
    <div id="all">
        <div id="content">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <jsp:include page="component/categories-sidebar.jsp" />
                    </div>
                    <div class="col-lg-9">
                        <jsp:include page="component/categories-body.jsp" />
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- *** BODY END ***-->


    <!-- *** FOOTER START ***-->
    <jsp:include page="component/footer.jsp" />
    <!-- *** FOOTER END ***-->


    <!-- *** COPYRIGHT START ***-->
    <jsp:include page="component/copyright.jsp" />
    <!-- *** COPYRIGHT END ***-->

    <!-- *** JAVASCRIPT START ***-->
    <jsp:include page="component/js.jsp" />
    <!-- *** JAVASCRIPT END ***-->
</body>
</body>
</html>