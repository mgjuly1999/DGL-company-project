
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/assets/template/header/header.jsp" %>
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
      Welcome
      <c:if test="${myHomeForm.role=='ga'}"> Gold </c:if>
      <c:if test="${myHomeForm.role=='sa'}"> Sliver </c:if>
      Admin
        
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dawei Golden land</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Info boxes -->
      <div class="row">
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-aqua"><i class="ion ion-ios-gear-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Total Staff</span>
              <span class="info-box-number">${myHomeForm.totalStaff}<small></small></span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-red"><i class="ion ion-ios-people-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Total Admin </span>
              <span class="info-box-number">${myHomeForm.totalAdmin}</span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
       
        <!-- /.col -->

        <!-- fix for small devices only -->
        <div class="clearfix visible-sm-block"></div>

        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-green"><i class="ion ion-ios-cart-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Total Buy</span>
              <span class="info-box-number">${myHomeForm.buyCount}</span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-yellow"><i class="ion ion-ios-people-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Total Customers</span>
              <span class="info-box-number">${myHomeForm.totalCustomer}</span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->

      <div class="row">
        <div class="col-md-5">
          <div class="box">
            <div class="box-header with-border">
              <h3 class="box-title">Today Information</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <div class="btn-group">
                  <button type="button" class="btn btn-box-tool dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-wrench"></i></button>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                  </ul>
                </div>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div class="row">
               
                <!-- /.col -->
                <div class="col-md-9">
                  <p class="text-center">
                    <strong>Today State</strong>
                  </p>

                  <div class="progress-group">
                    <span class="progress-text">Complete Buy </span>
                    <span class="progress-number"><b>${myHomeForm.numComplete}</b></span>

                    <div class="progress sm">
                      <div class="progress-bar progress-bar-aqua" style="width: ${myHomeForm.numComplete}%"></div>
                    </div>
                  </div>
                  <!-- /.progress-group -->
                  <div class="progress-group">
                    <span class="progress-text">Add Rubber Litter</span>
                    <span class="progress-number"><b>${myHomeForm.numReqLitterAndWater}</b></span>

                    <div class="progress sm">
                      <div class="progress-bar progress-bar-red" style="width: ${myHomeForm.numReqLitterAndWater}%"></div>
                    </div>
                  </div>
                  <!-- /.progress-group -->
                  <div class="progress-group">
                    <span class="progress-text">Add Water Litter</span>
                    <span class="progress-number"><b>${myHomeForm.numReqWaterLitter}</b></span>

                    <div class="progress sm">
                      <div class="progress-bar progress-bar-green" style="width: ${myHomeForm.numReqWaterLitter}%"></div>
                    </div>
                  </div>
                  <!-- /.progress-group -->
                 
                  <!-- /.progress-group -->
                </div>
                <!-- /.col -->
              </div>
              <!-- /.row -->
            </div>
            <!-- ./box-body -->
            <div class="box-footer">
      
            </div>
            <!-- /.box-footer -->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->

      <!-- Main row -->
      <div class="row">
        <!-- Left col -->
        <div class="col-md-8">
          <!-- MAP & BOX PANE -->
       
          <!-- /.box -->
          <div class="row">
        
            <!-- /.col -->
          </div>
          <!-- /.row -->

          <!-- TABLE: LATEST ORDERS -->
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">To Add Rubber Litters</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <c:if test="${myHomeForm.requireLitterStores.size()!=0}">
            <div class="box-body">
              <div class="table-responsive">
              <c:forEach var="store" items="${myHomeForm.requireLitterStores}">
                <h2 class="box-title">Store Id-${store.storeId}</h2>
                <table class="table no-margin">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Item Id</th>
                  <th>Buy Date</th>   
                  <th>update</th>
                
                  
                </tr>
                </thead>
                <tbody>
                 
             <c:forEach var="spl" items="${store.storePerLitters}" varStatus="s">
                <tr>
                
                 <td>${s.index+1}</td>
                <td>Id-${spl.storePerLitterId}</td>
                <td>${store.createDate}</td>
                 <td>${spl.pound} lb</td>
                 <th><a  class="btn btn-small btn-warning btn-xs" href="rubberLitterUpdatePath?storePerLitterId=${spl.storePerLitterId}&customerId=${store.customer.customerId}"><i class="glyphicon glyphicon-pencil"></i>Update</a></th>
                
                </tr>
                 </c:forEach>
              
                </tbody>
                <tfoot>
                <tr>
             	<th></th>
             	 <th>Total Pound :</th>
                  <th>${store.totalPound} lb</th>
                  <th> <a  class="btn btn-normal btn-success btn-xl"  href="rubberLitterInsertPath?storeId=${store.storeId}&customerId=${store.customer.customerId}"> <i class="glyphicon glyphicon-plus"></i>Add RubberLitter</a>
             </th>
                  <th>
                  </th>
               
                </tr>
              
                </tfoot>
                
              </table>
              </c:forEach> 
              </div>
              <!-- /.table-responsive -->
            </div>
            </c:if>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
              <a href="javascript:void(0)" class="btn btn-sm btn-info btn-flat pull-left"></a>
              <a href="javascript:void(0)" class="btn btn-sm btn-default btn-flat pull-right">View All</a>
            </div>
            <!-- /.box-footer -->
          </div>
           <c:if test="${myHomeForm.role=='ga'}">
          <c:if test="${myHomeForm.stores.size()!=0}">
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">To Add Water Litters</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div class="table-responsive">
                <table class="table no-margin">
                  <thead>
                  <tr>
                  	<th>No#</th>
                    <th>Store ID</th>
                    <th>Customer Name</th>
                    <th>Total Pound</th>
                    <th>Total Litter</th>
                    <th>Buy Date</th>
                    <th>Add Water Litter</th>
                  </tr>
                  </thead>
                  <tbody>
                   <c:forEach var="store" items="${myHomeForm.stores}" varStatus="s">
                 <tr>
               
                 <td>${s.index+1 }</td>
                 <td><a href="#">
                 ${store.storeId}
                 </a></td>
                 <td>${store.customer.name}</td>
                 <td>${store.totalPound}  lb</td>
                 <td>${store.totalLitter} Ltr</td>
                 <td>${store.createDate}</td>
                 <td><a class="btn btn-small btn-danger btn-xs" href="AddSingleWaterLitter?storeId=${store.storeId}">To Add <i class="glyphicon glyphicon-tint"></i></a></td>
                 
                
                </tr>
                 </c:forEach> 
                   </tbody>
                </table>
              </div>
              <!-- /.table-responsive -->
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
              <a href="javascript:void(0)" class="btn btn-sm btn-info btn-flat pull-left"></a>
              <a href="javascript:void(0)" class="btn btn-sm btn-default btn-flat pull-right">View All </a>
            </div>
            <!-- /.box-footer -->
          </div>
          </c:if>
        </c:if>
          <!-- /.box -->
        </div>
   
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
  <%@ include file="/assets/template/footer/footer.jsp" %>
