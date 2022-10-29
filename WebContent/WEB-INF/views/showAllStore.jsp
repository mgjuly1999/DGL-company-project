
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
     View All ${myShowAllStoreForm.customer.name}
        <small>Buy Rubber Information</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">To Show ${myShowAllStoreForm.customer.address.address} Customer Buy Information</a></li>
        <li class="active">View All ${myShowAllStoreForm.customer.name} Buy Rubber Information</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
     
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Customer ${myShowAllStoreForm.customer.name} Buy Informations</h3>
            </div>
            <!-- /.box-header -->
           
              <div class="table-responsive">
              <table id="example1" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Id</th>
                  <th>Total Litter</th>
                  <th>Total Pound</th>
                  <th>Water Litter</th>
                  <th>DRC</th>
                  <th>Dry Pound</th>
                  <th>Accept Staff</th>
                  <th>Gold Admin</th>
                  <th>Buy Date</th>
                 
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="store" items="${myShowAllStoreForm.stores}" varStatus="s">
                <tr>
                
                 <td>${s.index+1 }</td>
                 <td>s-${store.storeId }</td>
                 <td>${store.totalLitter } ltr</td>
                 <td>${store.totalPound } lb</td>
                 <td>${store.waterLitter } ltr</td>
                 <td>${store.drc}</td>
                 <td>${store.dryPound } lb</td>
                 <th>${store.adminByAdminId.name}</th>
                 <th>${store.adminByGoldAdminId.name}</th>
                 <td>${store.createDate}</td>
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
              <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                
                </tr>
                </tfoot>
              </table>
              <a href="showAllStoreDownLink">Download.... </a>
            </div>
           
           </div> <!-- /.box-body -->
          </div>
          <!-- /.box -->
        
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
 
<%@ include file="/assets/template/footer/generalFooter.jsp" %>
<%@ include file="/assets/template/footer/customerTableFooter.jsp" %>
