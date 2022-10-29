
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <header class="main-header">

    <!-- Logo -->
    <a href="homePath" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>Dawei Golden Land Company</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b> 
      <c:if test="${myHomeForm.role=='ga'}"> Gold </c:if>
      <c:if test="${myHomeForm.role=='sa'}"> Sliver </c:if>
      Admin</b>DGL</span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
          <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success">4</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 4 messages</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li><!-- start message -->
                    <a href="#">
                      <div class="pull-left">
                        <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Support Team
                        <small><i class="fa fa-clock-o"></i> 5 mins</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <!-- end message -->
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="dist/img/user3-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        AdminLTE Design Team
                        <small><i class="fa fa-clock-o"></i> 2 hours</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="dist/img/user4-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Developers
                        <small><i class="fa fa-clock-o"></i> Today</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="dist/img/user3-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Sales Department
                        <small><i class="fa fa-clock-o"></i> Yesterday</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="dist/img/user4-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Reviewers
                        <small><i class="fa fa-clock-o"></i> 2 days</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                </ul>
              </li>
              <li class="footer"><a href="#">See All Messages</a></li>
            </ul>
          </li>
          <!-- Notifications: style can be found in dropdown.less -->
          <li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 10 notifications</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li>
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5 new members joined today
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the
                      page and may cause design problems
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-users text-red"></i> 5 new members joined
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-user text-red"></i> You changed your username
                    </a>
                  </li>
                </ul>
              </li>
              <li class="footer"><a href="#">View all</a></li>
            </ul>
          </li>
          <!-- Tasks: style can be found in dropdown.less -->
          <li class="dropdown tasks-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">9</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Design some buttons
                        <small class="pull-right">20%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Create a nice theme
                        <small class="pull-right">40%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">40% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Some task I need to do
                        <small class="pull-right">60%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">60% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Make beautiful transitions
                        <small class="pull-right">80%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">80% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer">
                <a href="#">View all tasks</a>
              </li>
            </ul>
          </li>
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="<c:url value="/assets/template/dist/img/admin.png"/>" class="user-image" alt="User Image">
              <span class="hidden-xs">${myHomeForm.currentAdmin.getName()}</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="<c:url value="/assets/template/dist/img/admin.png"/>" class="img-circle" alt="User Image">

                <p>
                  ${myHomeForm.currentAdmin.getName()}
                  <small>Member since    ${myHomeForm.currentAdmin.getCreateDate()}</small>
                </p>
              </li>
              <!-- Menu Body -->
              <li class="user-body">
                <div class="row">
                  <div class="col-xs-4 text-center">
                    <a href="#">Followers</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Sales</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Friends</a>
                  </div>
                </div>
                <!-- /.row -->
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="homePath" class="btn btn-default btn-flat">Home</a>
                </div>
                <div class="pull-right">
                  <a href="logoutPath" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>

    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="<c:url value="/assets/template/dist/img/admin.png"/>" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>${myHomeForm.currentAdmin.getName()}</p>
          <a href="#"><i class="fa fa-circle text-success"></i>Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
          <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat">
                  <i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">MAIN NAVIGATION</li>
         <li>
          
           <a href="homePath">  
           <i class="fa fa-dashboard"></i> Home</a>
         
        </li>
  
         
         
         <li class="treeview">
          <a href="#">
            <i class="fa fa-cart-plus"></i> <span>To Buy Rubber</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
          
          <c:forEach var="a" items="${myHomeForm.addressList}">
            <li><a href="buyRubberLiquid?addressId=${a.addressId}">
            <i class="fa fa-circle-o"></i>${a.address}</a></li>
            </c:forEach>
           
          </ul>
        </li>
          
           <li class="treeview">
          <a href="#">
            <i class="glyphicon glyphicon-pencil"></i> <span>Edit  Rubber pounds</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
              <c:if test="${myHomeForm.addListForInsertRubberLitter.size()!=0}">
               <small class="label pull-right bg-red">
               ${myHomeForm.addListForInsertRubberLitter.size()}</small>
               </c:if>
            </span>
          </a>
          <ul class="treeview-menu">
          
          <c:forEach var="a" items="${myHomeForm.addListForInsertRubberLitter}">
            <li><a href="editRubberPound?addressId=${a.addressId}"><i class="fa fa-circle-o"></i>${a.address}</a></li>
            </c:forEach>
           
          </ul>
        </li>
       
        <c:if test="${myHomeForm.role=='ga'}">
       <li class="treeview">
          <a href="#">
            <i class="fa fa-database"></i> <span>Show Buy Information</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
          
          <c:forEach var="a" items="${myHomeForm.addListForShowAllStore}">
            <li><a href="showAllRubberInfo?addressId=${a.addressId}"><i class="fa fa-circle-o"></i>${a.address}</a></li>
            </c:forEach>
           
          </ul>
        </li>
        </c:if>
         <li class="treeview">
          <a href="#">
            <i class="fa fa-edit"></i> <span>Register</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="customerRegister"><i class="fa fa-circle-o"></i>New Customer</a></li>
            <li><a href="adminRegisterHomePath"><i class="fa fa-circle-o"></i>New Admin</a></li>
            <li><a href="adminRoleRegister"><i class="fa fa-circle-o"></i>New Admin Role</a></li>
             <li><a href="newAddressPath"><i class="fa fa-circle-o"></i>New Customer Address</a></li>
          </ul>
          </li>
            
           <li class="treeview">
          <a href="#">
            <i class="fa fa-balance-scale"></i> <span>Insert Rubber Litters</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
              <c:if test="${myHomeForm.addListForInsertRubberLitter.size()!=0}">
               <small class="label pull-right bg-red">${myHomeForm.addListForInsertRubberLitter.size()}</small>
               </c:if>
            </span>
          </a>
          <ul class="treeview-menu">
          
          <c:forEach var="a" items="${myHomeForm.addListForInsertRubberLitter}">
            <li><a href="addRubberLitter?addressId=${a.addressId}"><i class="fa fa-circle-o"></i>${a.address}</a></li>
            </c:forEach>
           
          </ul>
        </li>
         <c:if test="${myHomeForm.role=='ga'}">
         <li class="treeview">
          <a href="#">
            <i class="fa fa-tint"></i> <span>Add Water Litter</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
              <c:if test="${myHomeForm.addListForInsertWaterLitter.size()!=0}">
               <small class="label pull-right bg-yellow">
               ${myHomeForm.addListForInsertWaterLitter.size()}
               </small>
               </c:if>
            </span>
          </a>
          <ul class="treeview-menu">
          
          <c:forEach var="a" items="${myHomeForm.addListForInsertWaterLitter}">
            <li><a href="AddWaterLitter?addressId=${a.addressId}"><i class="fa fa-circle-o"></i>${a.address}</a></li>
            </c:forEach>
           
          </ul>
        </li>
          </c:if>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-table"></i> <span>To Show Customers</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
        
            <li><a href="customerTablePath"><i class="fa fa-circle-o"></i>Show All Customers</a></li>
		    </ul>
         
        </li>
         <li>
          
           <a href="logoutPath"><i class="fa fa-circle-o"></i>Logout</a>
          
        </li>
          <li>
          
           <a href="adminRegisterHomePath"><i class="fa fa-circle-o"></i>Register</a>
         
        </li>
        </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
 
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
  To Buy Liquid Rubber Pound For ${rubberPoundForm.customer.name}
        <small>Rubber Liquid Pound</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">View All ${rubberPoundForm.customer.address.address} Customers</a></li>
        <li class="active"> To  Buy Custumer ${rubberPoundForm.customer.name} Rubber Liquid Pound</li>
      </ol>
    </section>

   

      <section class="content">
      <div class="row">
        <div class="col-xs-20">

          <div class="box box-success">
            <div class="box-header">
              <h3 class="box-title">To Buy Liquid Rubber Pound for ${rubberPoundForm.customer.name}</h3>
            </div>
            <div class="box-body">
        <form:form action="saveItemToList?customerId=${rubberPoundForm.customer.customerId}"  modelAttribute="buyForm"  method="POST"  >    
       
           <div class="form-group">
                <label>Rubber Liquid Pound :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                   <i class="glyphicon glyphicon-filter"></i>
                  </div>
                    <form:input  required="required" type="text"  class="form-control"  id="pound" name="pound"
                     path="pound" placeholder="Enter pound" />
                 
                </div>
                <!-- /.input group -->
              </div>
         <div class="form-group">
                <label>Container Size :</label>
        <form:select  path="container" required="required"
         class="form-control select2" name="container" 
         id="container" style="width: 100%;" >
		<form:option value="" label="SELECT"/>
		<form:options items="${rubberPoundForm.containers}"/>
		</form:select>
              </div>
             
             
             <div class="form-group">
             
           <input type="submit" class="btn btn-block btn-success btn-sm" value="Add To Buy">
           </div>
		</form:form>
            </div>
            <!-- /.box-body -->
          </div>
 
        </div>
</div>
</section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
     
      <c:if test="${not empty rubberPoundForm.buyList}">
        <div class="col-xs-20">
     
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Customer Id :(${rubberPoundForm.customer.customerId}) ${rubberPoundForm.customer.name} </h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped table-hover dataTable js-exportable">
                <thead>
                <tr>
                  <th>No#</th> 
                  <th>Pound</th>
                  <th>Container Size</th>
                  <th>Delete</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="bl" items="${rubberPoundForm.buyList}" varStatus="s">
                <tr>
                
                 <td>${s.index+1}</td>
                 <td>${bl.pound} lb</td>
                 <td>${bl.containerName}</td>
                 <td><a class="btn btn-small btn-danger btn-xs" href="buyItemDeletePath?pound=${bl.pound}&customerId=${rubberPoundForm.customer.customerId}"><i class="glyphicon glyphicon-trash"></i>Delete</a></td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
             	<th>No#</th>
                <th>Pound</th>
                <th>Container Size</th>
                  <th>Delete</th>
                </tr>
                </tfoot>
                
              </table>
               <form:form action="saveItemAll?customerId=${rubberPoundForm.customer.customerId}" method="post">
             
              <button type="button" id="addLitterInsert" class="btn btn-block btn-success btn-sm" data-toggle="modal" data-target="#modal-success">
            Buy All
              </button>
           <div class="modal modal-success fade" id="modal-success">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">To Buy Rubber Pounds</h4>
              </div>
              <div class="modal-body">
              <p>
		<h3> To Buy Rubber Pounds For Customer Id :(${rubberPoundForm.customer.customerId})
		 ${rubberPoundForm.customer.name}  </h3>
		 <table id="example1" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th> 
                  <th>Pound</th>
                  <th>Container Size</th>
                  <th>Delete</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="bl" items="${rubberPoundForm.buyList}" varStatus="s">
                <tr>
                
                 <td>${s.index+1}</td>
                 <td>${bl.pound} lb</td>
                 <td>${bl.containerName}</td>
                 <td><a class="btn btn-small btn-danger btn-xs" href="buyItemDeletePath?pound=${bl.pound}&customerId=${rubberPoundForm.customer.customerId}"><i class="glyphicon glyphicon-trash"></i>Delete</a></td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
                <tr>
             	<th>No#</th>
                <th>Pound</th>
                <th>Container Size</th>
                  <th>Delete</th>
                </tr>
                </tfoot>
                
              </table>
		 </p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-outline" value="Are You Sure To Buy?">
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          </div>
          <!-- /.modal-dialog -->
              </form:form>
                    
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        </c:if>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
 
<%@ include file="/assets/template/footer/generalFooter.jsp" %>
<%@ include file="/assets/template/footer/customerTableFooter.jsp" %>
