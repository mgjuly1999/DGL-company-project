<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>
 
 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
       New Admin Register
        <small>Preview</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Forms</a></li>
        <li class="active"> New Admin Register</li>
      </ol>
    </section>

        <div class="col-md-6">

          <div class="box box-danger">
            <div class="box-header">
              <h3 class="box-title">New Admin Register</h3>
            </div>
            <div class="box-body">
<form:form action="adminSavepath"  modelAttribute="adminForm"  method="get"  >
	
    
             <div class="form-group has-feedback">
      <form:input type="text"  class="form-control"  id="name" name="name" path="name" placeholder="Full name" />
      
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
          
     <div class="form-group has-feedback">
      <form:input type="email"  class="form-control"  id="mail" name="mail" path="mail" placeholder="Email" />
      
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
  
      <div class="form-group has-feedback">
      <form:input type="password"  class="form-control"  id="pwd" name="pwd" path="pwd" placeholder="Password" />
      
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
      
         <form:input type="password"  class="form-control"  id="rePwd" name="rePwd" path="rePwd" placeholder="Retype password" />
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
        	<div class="form-group has-feedback">
	     <div class="radio icheck">
      <form:radiobutton path="gender" id="gender" name="gender" value="M" label="Male"/>
	<form:radiobutton path="gender" id="gender" name="gender" value="F" label="Female"/>
	</div>
	</div>
	  <div class="form-group has-feedback">
	     <div class="selectbox icheck">
	       <label>
	       Select Admin Role
      <form:select path="roleId" name="roleId" id="roleId">
		<form:option value="NONE" label="SELECT"/>
		<form:options items="${myRegisterForm.frmRoles}"/>
		
		
	
	</form:select>
	</label>
	</div>
	</div>
      
      <div class="row">
        <div class="col-xs-20">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> I agree to the <a href="#">terms</a>
            </label>
          </div>
        </div>
        <!-- /.col -->
        
        <!-- /.col -->
      </div>
     
              
             
             <div class="form-group">
             
           <input type="submit" class="btn btn-block btn-success btn-sm" value="Register">
           </div>

    </form:form>
            </div>
            <!-- /.box-body -->
          </div>
 
        </div>

    <div class="box box-info">
            <div class="box-header with-border">
            <div class="col-md-100">
          <!-- Custom Tabs (Pulled to the right) -->
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs pull-right">
              <li class="active"><a href="#show_All" data-toggle="tab">Show All</a>
              </li>
                <c:forEach var="role" items="${myRegisterForm.roles}">
                <c:if test="${role.admins.size()!=0}">
              <li><a href="#tab_${role.roleId}-${role.roleId}" data-toggle="tab">${role.roleName}</a>
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
               <table id="example1" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Mail</th>
                  <th>Register Date</th>
                  <th>Details</th>
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="admin" items="${myRegisterForm.admins}" varStatus="s">
                <tr>
                
                 <td>${s.index+1 }</td>
                 <td>cust-${admin.adminId }</td>
                 <td> <c:if test="${admin.gender=='m'}">U ${admin.name }
                 </c:if>
                  <c:if test="${admin.gender=='f'}">Daw ${admin.name }
                 </c:if>
                 </td>
                 <td>${admin.mail }</td>
                 <td>${admin.createDate}</td>
                 <td><a href="adminDetailsPath?adminId=${admin.adminId}">Details</a></td>
                 
                
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
                <c:forEach var="role" items="${myRegisterForm.roles}">
                                <c:if test="${role.admins.size()!=0}">
                
              <div class="tab-pane active" id="tab_${role.roleId}-${role.roleId}">
              <div class="box-body">
               <div class="table-responsive">
               <table id="example${role.roleId}" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Mail</th>
                  <th>Register Date</th>
                 
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="admin" items="${role.admins}" varStatus="s">
                 <tr>
                
                 <td>${s.index+1 }</td>
                 <td>cust-${admin.adminId}</td>
                 <td> <c:if test="${admin.gender=='m'}">U ${admin.name }
                 </c:if>
                  <c:if test="${admin.gender=='f'}">Daw ${admin.name }
                 </c:if>
                 </td>
                 <td>${admin.mail }</td>
                 <td>${admin.createDate}</td>
                 
                
                </tr>
                 </c:forEach>
             
                </tbody>
                <tfoot>
               <tr>
                  <th>No#</th>
                  <th>Code</th>
                  <th>Name</th>
                  <th>Mail</th>
                  <th>Register Date</th>
                
                </tr>
                </tfoot>
              </table>
             </div>
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
    </div>    
            
    
    <!-- /.content -->
  </div>

 
  <%@ include file="/assets/template/footer/generalFooter.jsp" %>
  <%@ include file="/assets/template/footer/CustomerRegisterFooter.jsp" %>