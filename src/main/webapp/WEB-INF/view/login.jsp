<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Kinmel - Login/Register</title>
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

    <div id="all" class="get-top-margin">
      <div id="content">
        <div class="container">
          <div class="row">
            <div class="col-lg-12">
              <!-- *** BREADCRUMB START ***-->

              <!-- *** BREADCRUMB END ***-->
            </div>
            <div class="col-lg-6">
              <div class="box">
                <h1>New account</h1>
                <p class="lead">Not our registered customer yet?</p>
                <p>Please register by providing the details below. Your personal information won't be shared without your consent to anyone.</p>
                <p class="text-muted">If you have any questions, please feel free to <a href="contact.html">contact us</a>, our customer service center is working for you 24/7.</p>
                <hr>
                <!-- If registration succeed -->
                <c:if test="${param.register != null}">
                  <div class="alert alert-success alert-dismissible fade show" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                    <strong class="test"><spring:message code="success.register"/> </strong>
                  </div>
                </c:if>
                <!-- If registration user exists -->
                <c:if test="${param.regUserExists != null}">
                  <div class="alert alert-warning alert-dismissible fade show" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                    <strong class="test"><spring:message code="error.register.username"/> </strong>
                  </div>
                </c:if>
                <!-- If registration failed -->
                <c:if test="${param.regFailed != null}">
                  <div class="alert alert-error alert-dismissible fade show" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                    <strong class="test"><spring:message code="error.register"/> </strong>
                  </div>
                </c:if>
                <form:form action="/register" method="post" modelAttribute="newUser">
                  <div class="form-group">
                    <label for="first_name">First Name * </label><form:errors cssClass="text-danger get-left-margin" path="firstName"/>
                    <form:input id="first_name" name="first_name" path="firstName" type="text" class="form-control" required="required" />
                  </div>

                  <div class="form-group">
                    <label for="last_name">Last Name *</label><form:errors cssClass="text-danger get-left-margin" path="lastName"/>
                    <form:input id="last_name" name="last_name" path="lastName" type="text" class="form-control" required="required"/>
                  </div>
                  <div class="form-group">
                    <label for="username_reg">Username *</label><form:errors cssClass="text-danger get-left-margin" path="username"/>
                    <form:input id="username_reg" name="username_reg" path="username" type="text" class="form-control" required="required"/>
                  </div>
                  <div class="form-group">
                    <label for="password_reg">Password *</label><form:errors cssClass="text-danger get-left-margin" path="password"/>
                    <form:input id="password_reg" name="password_reg" path="password" type="password" class="form-control" required="required"/>
                  </div>
                  <div class="form-group">
                    <label for="email">Email</label><form:errors cssClass="text-danger get-left-margin" path="email"/>
                    <form:input id="email" type="email" path="email" class="form-control" />
                  </div>
                  <div class="form-group">
                    <label for="phone">Phone</label><form:errors cssClass="text-danger get-left-margin" path="phone"/>
                    <form:input id="phone" type="number" path="phone" class="form-control" />
                  </div>
                  <div class="form-group">
                    <label for="mobile">Mobile *</label><form:errors cssClass="text-danger get-left-margin" path="mobile"/>
                    <form:input id="mobile" type="number" path="mobile" class="form-control" required="required"/>
                  </div>
                  <div class="form-group">
                    <label for="address">Address</label><form:errors cssClass="text-danger get-left-margin" path="address"/>
                    <form:input id="address" type="address" path="address" class="form-control" />
                  </div>
                  <form:hidden path="enabled" value="Y" />
                  <form:hidden path="authorities" value="ROLE_USER" />
                  <div class="text-center">
                    <button type="submit" class="btn btn-primary"><i class="fa fa-user-md"></i> Register</button>
                  </div>
                </form:form>
              </div>
            </div>
            <div class="col-lg-6">
              <div class="box">
                <h1>Login</h1>
                <p class="lead">Already our customer?</p>
                <p class="text-muted">Welcome to Kinmel Application. Please provide the credentials for login and then get benefited by the large set of products available here.</p>
                <hr>
                <!-- If any error during login -->
                <c:if test="${param.error ne null}">
                  <div class="alert alert-danger alert-dismissible fade show" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                    <strong class="test"><spring:message code="error.bad.credentials"/> </strong>
                  </div>
                </c:if>
                <!-- If logout -->
                <c:if test="${param.logout ne null}">
                  <div class="alert alert-success alert-dismissible fade show" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                    <strong class="test"><spring:message code="success.logout"/> </strong>
                  </div>
                </c:if>
                <form action="<spring:url value="/login" />" method="post">
                  <div class="form-group">
                    <label for="username">Username</label>
                    <input id="username" name="username" type="text" class="form-control" required>
                  </div>
                  <div class="form-group">
                    <label for="password">Password</label>
                    <input id="password" name="password" type="password" class="form-control" required>
                  </div>
                  <div class="text-center">
                    <button type="submit" class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- *** FOOTER START ***-->

    <!-- *** FOOTER END ***-->


    <!-- *** COPYRIGHT START ***-->

    <!-- *** COPYRIGHT END ***-->

    <!-- *** JAVASCRIPT START ***-->
    <jsp:include page="component/js.jsp" />
    <!-- *** JAVASCRIPT END ***-->
  </body>
</html>