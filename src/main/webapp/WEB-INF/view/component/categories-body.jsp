<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="box">
    <h1>Automobiles</h1>
    <p>The below list contains the information on Automobiles record.</p>
</div>
<div class="row products">
    <div class="col-lg-4 col-md-6">
        <div class="product">
            <div class="flip-container">
                <div class="flipper">
                    <div class="front"><a href="#"><img src="img/product1.jpg" alt="" class="img-fluid"></a>
                    </div>
                    <div class="back"><a href="#"><img src="img/basketsquare.jpg" alt="" class="img-fluid"></a>
                    </div>
                </div>
            </div>
            <a href="#" class="invisible"><img src="img/product1.jpg" alt="" class="img-fluid"></a>
            <div class="text">
                <h3><a href="#">Fur coat with very but very very long name</a></h3>
                <p class="price">
                    <del></del>
                    $143.00
                </p>
                <p class="buttons"><a href="#" class="btn btn-outline-secondary">View detail</a><a
                        href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                </p>
            </div>
            <!-- /.text-->
        </div>
        <!-- /.product            -->
    </div>
</div>
<div class="pages">
    <p class="loadMore"><a href="#" class="btn btn-primary btn-lg"><i class="fa fa-chevron-down"></i> Load more</a></p>
    <nav aria-label="Page navigation example" class="d-flex justify-content-center">
        <ul class="pagination">
            <li class="page-item"><a href="#" aria-label="Previous" class="page-link"><span
                    aria-hidden="true">«</span><span class="sr-only">Previous</span></a></li>
            <li class="page-item active"><a href="#" class="page-link">1</a></li>
            <li class="page-item"><a href="#" class="page-link">2</a></li>
            <li class="page-item"><a href="#" class="page-link">3</a></li>
            <li class="page-item"><a href="#" class="page-link">4</a></li>
            <li class="page-item"><a href="#" class="page-link">5</a></li>
            <li class="page-item"><a href="#" aria-label="Next" class="page-link"><span aria-hidden="true">»</span><span
                    class="sr-only">Next</span></a></li>
        </ul>
    </nav>
</div>