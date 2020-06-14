<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:useBean id="categories" scope="request" type="java.util.List"/>
<div class="card sidebar-menu mb-4">
    <div class="card-header">
        <h3 class="h4 card-title">Categories</h3>
    </div>
    <div class="card-body">
        <ul class="nav nav-pills flex-column category-menu">
            <c:forEach items="${categories}" var="category">
                <li><a data-toggle="collapse" href="#${category.code}" role="button" class="nav-link"
                       aria-expanded="false"
                       id="main-${category.code}" aria-controls="${category.code}">${category.name} <span
                        class="badge badge-secondary">10</span></a>
                    <ul class="list-unstyled collapse multi-collapse" id="${category.code}">
                        <c:forEach var="categoryDetail" items="${category.categoryDetails}">
                            <li><a id="${category.code}-${categoryDetail.code}" href="#" role="button"
                                   class="nav-item">${categoryDetail.categoryDetailId.name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>

<c:forEach items="${baseFilters}" var="baseFilter">
    <div class="card sidebar-menu mb-4 category-filter">

        <div class="card-header">
            <h3 class="h4 card-title">${baseFilter.name} <a href="#" class="btn btn-sm btn-danger pull-right"><i
                    id="${baseFilter.code}-btn-clear" class="fa fa-times-circle"></i> Clear</a></h3>
        </div>
        <div class="card-body">
            <form>
                <div class="form-group">
                    <c:forEach items="${baseFilter.baseFilterDetails}" var="baseFilterDetail">
                        <div class="checkbox">
                            <label>
                                <input name="${baseFilter.code}-checkboxes" type="checkbox"> ${baseFilterDetail.baseFilterDetailId.name}
                            </label>
                        </div>
                    </c:forEach>
                </div>
                <button id="${baseFilter.code}-btn-apply" class="btn btn-default btn-sm btn-primary"><i class="fa fa-pencil"></i> Apply</button>
            </form>
        </div>

    </div>
</c:forEach>