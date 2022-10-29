
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <%@ include file="/assets/template/header/CustomerRegisterHeader.jsp" %>
 <%@ include file="/assets/template/mainhearSlightbar/HeaderAndSideBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
    To  Add Rubber Litter For Customer Id :(${addRubberLitterForm.customer.customerId}) ${myForm.customer.name}  
        <small></small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active"><a href="#"> To  Accept Rubber Litter</a></li>
      </ol>
    </section>

   
    <section class="content">
      <div class="row">
        <div class="col-xs-20">
        <c:if test="${addRubberLitterForm.store!=null}">
    
		<c:if test="${addRubberLitterForm.flag=='update'}">
		 <div class="box box-warning">
            <div class="box-header">
              <h3 class="box-title">To Update Information for Store Id-${addRubberLitterForm.storePerLitter.store.storeId}</h3>
            </div>
            <div class="box-body">
        <form:form action="rubberLitterUpdateSubmit" 
         modelAttribute="rubberLitterForm"  method="POST"  >    
             <form:input type="hidden" value="${addRubberLitterForm.customer.customerId}" 
                    id="customerId" name="customerId" path="customerId" />
             
             <form:input type="hidden" value="${addRubberLitterForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId"/>
             
             <div class="form-group">
                <label>Item ID :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-qrcode"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${addRubberLitterForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId" 
                    placeholder="${addRubberLitterForm.storePerLitter.storePerLitterId}" disabled="true"/>
                 
                </div>
                <!-- /.input group -->
              </div>   
              
               <div class="form-group">
                <label>Rubber Pound :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-filter"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${addRubberLitterForm.storePerLitter.pound}" 
                    id="pound" name="pound" path="pound" placeholder="${addRubberLitterForm.storePerLitter.pound}"
                     required="required"/>
                 
                </div>
                <!-- /.input group -->
              </div>
        
              <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#modal-warning">
            Update Litter
              </button>
           
			
			  <div class="modal modal-warning fade" id="modal-warning">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">To Update Rubber Pound/litter</h4>
              </div>
              <div class="modal-body">
                <p>
		<h3> Update Pound/litter For Customer Id :(${addRubberLitterForm.customer.customerId})
		 ${addRubberLitterForm.customer.name}  </h3>
		 Item Id :${addRubberLitterForm.storePerLitter.storePerLitterId}<br>
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
        <c:if test="${addRubberLitterForm.flag=='delete'}">
		 <div class="box box-danger">
            <div class="box-header">
              <h3 class="box-title">To Update Information for Store Id-${addRubberLitterForm.storePerLitter.store.storeId}</h3>
            </div>
            <div class="box-body">
        <form:form action="rubberLitterDeleteSubmit?customerId=${addRubberLitterForm.customer.customerId}&storePerLitterId=${addRubberLitterForm.storePerLitter.storePerLitterId}"  modelAttribute="updateForm"  method="POST"  >    
             
             <div class="form-group">
                <label>Item ID :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-qrcode"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${addRubberLitterForm.storePerLitter.storePerLitterId}" 
                    id="storePerLitterId" name="storePerLitterId" path="storePerLitterId" 
                    placeholder="${addRubberLitterForm.storePerLitter.storePerLitterId}" disabled="true"/>
                 
                </div>
                <!-- /.input group -->
              </div>   
           <div class="form-group">
                <label>Rubber Litter :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-balance-scale"></i>
                  </div>
                    <form:input type="text"  class="form-control"  value="${addRubberLitterForm.storePerLitter.litter}" 
                    id="litter" name="litter" path="litter" disabled="true" />
                 
                </div>
                <!-- /.input group -->
              </div>
       
               <div class="form-group">
                <label>Rubber Pound :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-filter"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${addRubberLitterForm.storePerLitter.pound} lb" 
                    id="pound" name="pound" path="pound" placeholder="${addRubberLitterForm.storePerLitter.pound}"
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
		<h3> Delete Rubber Litter For Customer Id :(${addRubberLitterForm.customer.customerId})
		 ${addRubberLitterForm.customer.name}  </h3>
		 Item Id :${addRubberLitterForm.storePerLitter.storePerLitterId}<br>
		 Rubber Pound :${addRubberLitterForm.storePerLitter.pound}  lb<br>
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
           <c:if test="${addRubberLitterForm.store!=null}">
           <c:if test="${addRubberLitterForm.flag=='insert'}">
             <div class="box box-success">
            <div class="box-header">
              <h3 class="box-title">Add Rubber Litter For Store Id-${addRubberLitterForm.store.storeId}</h3>
            </div>
            <div class="box-body">
        <form:form action="rubberTotalLitterInsertSubmit"  modelAttribute="addLitterForm"  method="POST"  >    
            <form:input type="hidden" path="customerId" id="customerId" name="customerId" value="${addRubberLitterForm.customer.customerId}" />
            <form:input type="hidden" path="storeId" id="storeId" name="storeId" value="${addRubberLitterForm.store.storeId}" />
             <div class="form-group">
                <label>Store ID :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="glyphicon glyphicon-qrcode"></i>
                  </div>
                    <input type="text"  class="form-control" value="${addRubberLitterForm.store.storeId}"  placeholder="${addRubberLitterForm.store.storeId}" disabled="true"/>
                 
                </div>
                <!-- /.input group -->
              </div>   
           <div class="form-group">
                <label>Total Rubber Litters :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                       <i class="fa fa-balance-scale"></i>
                  </div>
                    <form:input type="text"  class="form-control"  id="totalLitter" name="totalLitter" path="totalLitter" placeholder="Enter Total Litter" required="required" />
                 
                </div>
                <!-- /.input group -->
              </div>
               <div class="form-group">
                <label>Total Rubber Pounds :</label>

                <div class="input-group">
                  <div class="input-group-addon">
                     <i class="glyphicon glyphicon-filter"></i>
                  </div>
                    <form:input type="text"  class="form-control" value="${addRubberLitterForm.store.totalPound}  lb" id="totalPound" name="totalPound" path="totalPound" placeholder="${addRubberLitterForm.store.totalPound}" disabled="true"/>
                 
                </div>
              
              </div>
              
         <button type="button" id="addLitterInsert" class="btn btn-success" data-toggle="modal" data-target="#modal-success">
              Add Total Litters
              </button>
           <div class="modal modal-success fade" id="modal-success">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">To Add Total Litters</h4>
              </div>
              <div class="modal-body">
              <p>
		<h3> Add Total Rubber Litters For Customer Id :(${addRubberLitterForm.customer.customerId})
		 ${addRubberLitterForm.customer.name}  </h3>
		 Item Id :${addRubberLitterForm.store.storeId}<br>
		 Rubber Pound :${addRubberLitterForm.store.totalPound}  lb<br>
		 </p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-outline" value="Are You Sure To Add Total Litters?">
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
       <div class="box box-info">
      
           <c:forEach var="store" items="${addRubberLitterForm.stores}" varStatus="s"> 
          <div class="box">
            <div class="box-header with-border">
            <h2>Store Id- ${store.storeId}</h2>
              <h3 class="box-title">To Add Litters For Customer Id :(${addRubberLitterForm.customer.customerId}) ${addRubberLitterForm.customer.name} </h3>
            </div>
            <!-- /.box-header -->
          
          
              <div class="box-body">
               <div class="table-responsive">
              <table id="example1" class="table table-bordered table-striped table-hover dataTable js-exportable">
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
