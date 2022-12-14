<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Dawei Golden Land Admin | Customer Register</title>
   <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">

  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link href="<c:url value="/assets/template/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css"/>" rel="stylesheet"/>
  
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/bootstrap/dist/css/bootstrap.min.css"/>">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/font-awesome/css/font-awesome.min.css"/>">
  <!-- Ionicons -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/Ionicons/css/ionicons.min.css"/>">
  <!-- daterange picker -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/bootstrap-daterangepicker/daterangepicker.css"/>">
  <!-- bootstrap datepicker -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css"/>">
  <!-- iCheck for checkboxes and radio inputs -->
  <link rel="stylesheet" href="<c:url value="/assets/template/plugins/iCheck/all.css"/>">
  <!-- Bootstrap Color Picker -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"/>">
  <!-- Bootstrap time Picker -->
  <link rel="stylesheet" href="<c:url value="/assets/template/plugins/timepicker/bootstrap-timepicker.min.css"/>">
  <!-- Select2 -->
  <link rel="stylesheet" href="<c:url value="/assets/template/bower_components/select2/dist/css/select2.min.css"/>">
  <!-- Theme style -->
  <link rel="stylesheet" href="<c:url value="/assets/template/dist/css/AdminLTE.min.css"/>">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="<c:url value="/assets/template/dist/css/skins/_all-skins.min.css"/>">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
          <style>
    .example-modal .modal {
      position: relative;
      top: auto;
      bottom: auto;
      right: auto;
      left: auto;
      display: block;
      z-index: 1;
    }

    .example-modal .modal {
      background: transparent !important;
    }
  </style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">