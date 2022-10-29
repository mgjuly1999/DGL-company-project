
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
  <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
  ${GroupByAddressForm.address.address} Customers
        <small>To Buy Rubber</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">View All ${GroupByAddressForm.address.address} Customers</a></li>
      
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-20">
     
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">View All ${GroupByAddressForm.address.address} Customer</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>To Buy</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="c" items="${GroupByAddressForm.customers}" varStatus="s">
                <tr>
                
                 <td>${s.index+1 }</td>
                 <td>cust-${c.customerId }</td>
                 <td>
                 <c:if test="${c.male=='m'}">U ${c.name }
                 </c:if>
                  <c:if test="${c.male=='f'}">Daw ${c.name }
                 </c:if>
                 </td>
               
                 <td><a href="toBuyPath?customerId=${c.customerId}">
                  <i class="fa fa-cart-plus"></i> Buy</a></td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
              <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>To Buy</th>
                </tr>
                </tfoot>
              </table>
              <a href="customerRegister">New Customer Register</a>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
 
<%@ include file="/assets/template/footer/generalFooter.jsp" %>
<%@ include file="/assets/template/footer/customerTableFooter.jsp" %>
