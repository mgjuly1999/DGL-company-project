
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
   View All  ${editPoundForm.address.address} Customers
        <small>Edits Rubber Liquid Pound</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active"><a href="#"> View All  ${editPoundForm.address.address} Customers</a></li>
       
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
     
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">View All ${editPoundForm.address.address} Customers</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Add Litters</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="c" items="${editPoundForm.customers}" varStatus="s">
                <tr>
                
                 <td>${s.index+1 }</td>
                 <td>cust-${c.customerId }</td>
                 <td> 
                 <c:if test="${c.male=='m'}">U ${c.name }
                 </c:if>
                  <c:if test="${c.male=='f'}">Daw ${c.name }
                 </c:if>
                 </td>
               
                 <td><a  class="btn btn-small btn-success btn-xs" href="toEditPoundPath?customerId=${c.customerId}">Edits Liquid Pound  <i class="glyphicon glyphicon-arrow-right"></i></a></td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
              <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Add Litters</th>
                </tr>
                </tfoot>
              </table>
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
