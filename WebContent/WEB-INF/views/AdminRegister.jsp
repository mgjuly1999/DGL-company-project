<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminDGL | Registration Page</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/bootstrap/dist/css/bootstrap.min.css"/>">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/font-awesome/css/font-awesome.min.css"/>">
  <!-- Ionicons -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/Ionicons/css/ionicons.min.css"/>">
  <!-- Theme style -->
  <link rel="stylesheet" href="<c:url value="/assets/template/dist/css/AdminLTE.min.css"/>">
  <!-- iCheck -->
  <link rel="stylesheet" href="<c:url value="/assets/template/plugins/iCheck/square/blue.css"/>">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition register-page">

        <div class="col-md-6">

          <div class="box box-danger">
            <div class="box-header">
              <h3 class="box-title">New Admin Register</h3>
            </div>
            <div class="box-body">
        <form:form action="adminRegisterOuterSubmit"  modelAttribute="adminForm"  method="POST"  >
	
    
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



<script src="<c:url value="/assets/template/bower_components/jquery/dist/jquery.min.js"/>"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<c:url value="/assets/template/bower_components/bootstrap/dist/js/bootstrap.min.js"/>"></script>
<!-- iCheck -->
<script src="<c:url value="/assets/template/plugins/iCheck/icheck.min.js"/>"></script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' /* optional */
    });
  });
</script>
</body>
</html>
