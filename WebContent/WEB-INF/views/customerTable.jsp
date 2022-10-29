
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
     View All
        <small> Customer</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Customer Table</a></li>
        <li class="active">View All Customer</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
     
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Dawei Golden Land Customers</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                    <!-- /.col -->

        <div class="col-md-20">
          
           
          <!-- Custom Tabs (Pulled to the right) -->
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs pull-right">
              <li class="active"><a href="#show_All" data-toggle="tab">Show All</a>
              </li>
                <c:forEach var="address" items="${addList}">
                <c:if test="${address.customers.size()!=0}">
              <li><a href="#tab_${address.addressId}-${address.addressId}" data-toggle="tab">${address.address}</a>
              </li>
              </c:if>
            </c:forEach>
            
              <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                  Dropdown <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Another action</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Something else here</a></li>
                  <li role="presentation" class="divider"></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
                </ul>
              </li>
              <li class="pull-left header"><i class="fa fa-th"></i>Customers Lists</li>
            </ul>
            <div class="tab-content">
              <div class="tab-pane active" id="show_All">
                 <div class="box">
            <div class="box-header">
              <h3 class="box-title">
               </h3>
            </div>
            <!-- /.box-header -->
          
          <div class="box-body">
              <div class="table-responsive">
               <table id="example1" class="table table-bordered table-striped table-hover dataTable js-exportable">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Phone</th>
                  <th>Register Date</th>
                  <th>Details</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="c" items="${frmCustomerList}" varStatus="s">
                <tr>
                
                 <td>${s.index+1 }</td>
                 <td>cust-${c.customerId }</td>
                 <td> <c:if test="${c.male=='m'}">U ${c.name }
                 </c:if>
                  <c:if test="${c.male=='f'}">Daw ${c.name }
                 </c:if>
                 </td>
                 <td>${c.phone }</td>
                 <td>${c.createDate}</td>
                 <td><a href="customerDetailsPath?customerId=${c.customerId}">Details</a></td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
              <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Phone</th>
                  <th>Register Date</th>
                  <th>Details</th>
                </tr>
                </tfoot>
              </table>
              </div>
              </div>
              </div>
              
              </div>
              <!-- /.tab-pane -->
                <c:forEach var="address" items="${addList}">
                                <c:if test="${address.customers.size()!=0}">
                
              <div class="tab-pane active" id="tab_${address.addressId}-${address.addressId}">
               <div class="table-responsive">
               <table id="example${address.addressId}"
                class="table table-bordered table-striped table-hover dataTable js-exportable">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Phone</th>
                  <th>Register Date</th>
                  <th>Details</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="c" items="${address.customers}" varStatus="s">
                <tr>
                
                 <td>${s.index+1 }</td>
                 <td>cust-${c.customerId }</td>
                 <td> <c:if test="${c.male=='m'}">U ${c.name }
                 </c:if>
                  <c:if test="${c.male=='f'}">Daw ${c.name }
                 </c:if>
                 </td>
                 <td>${c.phone }</td>
                 <td>${c.createDate}</td>
                 <td><a href="customerDetailsPath?customerId=${c.customerId}">Details</a></td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
              <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Phone</th>
                  <th>Register Date</th>
                  <th>Details</th>
                </tr>
                </tfoot>
              </table>
              </div>
              </div>
              </c:if>
              </c:forEach>
              <!-- /.tab-pane -->
             
              <!-- /.tab-pane -->
            </div>
            <!-- /.tab-content -->
          </div>
          <!-- nav-tabs-custom -->
       
        </div>
        
            
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
