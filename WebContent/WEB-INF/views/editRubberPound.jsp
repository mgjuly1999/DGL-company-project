
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
    To  Edit Rubber Liquid Pound For Customer Id :(${editPoundForm.customer.customerId}) ${editPoundForm.customer.name}  
        <small></small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active"><a href="#"> To  Edit Rubber Pound</a></li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-20">
        <c:if test="${editPoundForm.storePerLitter!=null}">
     
		
		<c:if test="${editPoundForm.editPoundFlag=='update'}">
		 <div class="box box-warning">
            <div class="box-header">
              <h3 class="box-title">To Edit Rubber Liquid Pound for Store Id-${editPoundForm.storePerLitter.store.storeId}</h3>
            </div>
            <div class="box-body">
        <form:form action="rubberPoundEditsSubmit"  
        modelAttribute="updatePoundForm"  method="POST"  >    
           
           <form:input type="hidden"  value="${editPoundForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId" 
                   />
           <form:input type="hidden"  value="update" 
                    id="flag" name="flag" path="flag" 
                   /> 
           
           <form:input type="hidden"  value="${editPoundForm.customer.customerId}" 
                    id="customerId" name="customerId" path="customerId" 
                   />
                 
                  
             <div class="form-group">
                <label>Item ID :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-qrcode"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${editPoundForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId" 
                    placeholder="${editPoundForm.storePerLitter.storePerLitterId}" disabled="true"/>
                 
                </div>
                <!-- /.input group -->
              </div>   
         
               <div class="form-group">
                <label>Rubber Pound :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-filter"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${editPoundForm.storePerLitter.pound}" 
                    id="pound" name="pound" path="pound" placeholder="${editPoundForm.storePerLitter.pound}"
                     required="required"/>
                 
                </div>
                <!-- /.input group -->
              </div>
        
              <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#modal-warning">
            Edit Liquid Pound
              </button>
           
			
			  <div class="modal modal-warning fade" id="modal-warning">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">To Edit Rubber Liquid Pound</h4>
              </div>
              <div class="modal-body">
                <p>
		<h3> Update Pound/litter For Customer Id :(${editPoundForm.customer.customerId})
		 ${myForm.customer.name}  </h3>
		 Item Id :${editPoundForm.storePerLitter.storePerLitterId}<br>
			Are you Sure to update?
			 </p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-outline" value="Are you sure to update?">
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
		</form:form>
		</div>
		</div>
		</c:if>
        <c:if test="${editPoundForm.editPoundFlag=='delete'}">
		 <div class="box box-danger">
            <div class="box-header">
              <h3 class="box-title">To Update Information for Store Id-${editPoundForm.store.storeId}</h3>
            </div>
            <div class="box-body">
        <form:form action="rubberPoundUpdateSubmit"  
        modelAttribute="updatePoundForm"  method="POST"  >    
         
            <form:input type="hidden"  value="${editPoundForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId" 
                   />
              <form:input type="hidden"  value="delete" 
                    id="flag" name="flag" path="flag" 
                   />
             <form:input type="hidden"  value="${editPoundForm.customer.customerId}" 
                    id="customerId" name="customerId" path="customerId" 
                   />
          
             <div class="form-group">
                <label>Item ID :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-qrcode"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${editPoundForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId" 
                    placeholder="${editPoundForm.storePerLitter.storePerLitterId}" disabled="true"/>
                 
                </div>
                <!-- /.input group -->
              </div>   
          
               <div class="form-group">
                <label>Rubber Pound :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-filter"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${editPoundForm.storePerLitter.pound} lb" 
                    id="pound" name="pound" path="pound" placeholder="${editPoundForm.storePerLitter.pound}"
                     disabled="true"/>
                 
                </div>
                <!-- /.input group -->
              </div>
        
          <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modal-danger">
               Delete 
              </button>
              <div class="modal modal-danger fade" id="modal-danger">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">To Delete Rubber Litter</h4>
              </div>
              <div class="modal-body">
                 <p>
		<h3> Delete Rubber Litter For Customer Id :(${editPoundForm.customer.customerId})
		 ${editPoundForm.customer.name}  </h3>
		 Item Id :${editPoundForm.storePerLitter.storePerLitterId}<br>
		 Rubber Pound :${editPoundForm.storePerLitter.pound}  lb<br>
		 </p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-outline" value="Are you sure to delete?">
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
		</form:form>
		</div>
		</div>
		</c:if>   
       
          </c:if>
        
        <div class="col-xs-13">
      
          
             <c:forEach var="store" items="${editPoundForm.stores}">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">To Edits Rubber Liquid For Customer Id :(${editPoundForm.customer.customerId}) ${myForm.customer.name}
                   Store Id :${store.storeId}
               </h3>
            </div>
            <!-- /.box-header -->
         
            <div class="box-body">
            <div class="col-xs-13">
              <table id="example1" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>No#</th>
                  <th>Item Id</th>
                  <th>Buy Date</th>
                  <th>Pound</th>
                  
                  <th>update</th>
                
                  
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="spl" items="${store.storePerLitters}" varStatus="s">
            
                <tr>
                
                 <td>${s.index+1}</td>
                <td>s-${spl.storePerLitterId}</td>
                <td>${spl.store.createDate}</td>
                 <td>${spl.pound} lb</td>
                 <th><a  class="btn btn-small btn-warning btn-xs" href="rubberPoundEditPath?storePerLitterId=${spl.storePerLitterId}&customerId=${editPoundForm.customer.customerId}"><i class="glyphicon glyphicon-pencil"></i>Update</a></th>
                
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
                
                </tr>
                </tfoot>
                
              </table>        
            </div>
            </div>
           
            <!-- /.box-body -->
          </div>
          </c:forEach>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
 
<%@ include file="/assets/template/footer/generalFooter.jsp" %>
<%@ include file="/assets/template/footer/customerTableFooter.jsp" %>
