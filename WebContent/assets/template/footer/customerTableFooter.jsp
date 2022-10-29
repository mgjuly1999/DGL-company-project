<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- ./wrapper -->
	<script src="<c:url value="/assets/template/plugins/jquery-datatable/jquery.dataTables.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/buttons.flash.min.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/jszip.min.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/pdfmake.min.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/vfs_fonts.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/buttons.html5.min.js"/>"></script>
    <script src="<c:url value="/assets/template/plugins/jquery-datatable/extensions/export/buttons.print.min.js"/>"></script>

<!-- jQuery 3 -->
<script src="<c:url value="/assets/template/bower_components/jquery/dist/jquery.min.js"/>"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<c:url value="/assets/template/bower_components/bootstrap/dist/js/bootstrap.min.js"/>"></script>
<!-- DataTables -->
<script src="<c:url value="/assets/template/bower_components/datatables.net/js/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/assets/template/bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"/>"></script>
<!-- SlimScroll -->
<script src="<c:url value="/assets/template/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"/>"></script>
<!-- FastClick -->
<script src="<c:url value="/assets/template/bower_components/fastclick/lib/fastclick.js"/>"></script>
<!-- AdminLTE App -->
<script src="<c:url value="/assets/template/dist/js/adminlte.min.js"/>"></script>
<!-- AdminLTE for demo purposes -->
<script src="<c:url value="/assets/template/dist/js/demo.js"/>"></script>


<!-- page script -->
<script>
$(document).ready(function(){

    $("#addLitterInsert").click(function(){

        var str = $("#addLitterInsert").val();
        var x = document.getElementById("rubberLitter"); 
        x.innerHTML= str;
      

    });

});


  $(function () {
    $('#example1').DataTable()
    $('#example2').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false
    })
  })
</script>
</body>
</html>
