<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/jsp/common/doctype.jsp" %>
<html>
<head>
<jsp:include page="/jsp/common/htmlhead.jsp">
	<jsp:param name="basic" value="true"/>
	<jsp:param name="jbox" value="true"/>
	<jsp:param name="jquery_form" value="false"/>
	<jsp:param name="jquery_ui_tooltip" value="true"/>
	<jsp:param name="jquery_ui_combobox" value="false"/>
	<jsp:param name="jquery_ui_sortable" value="false"/>
	<jsp:param name="jquery_cxselect" value="false"/>
	<jsp:param name="jquery_scrollTo" value="false"/>
	<jsp:param name="jquery_jcallout" value="false"/>
	<jsp:param name="jquery_validation" value="true"/>
	<jsp:param name="jquery_datePicker" value="true"/>
	<jsp:param name="jquery_fullcalendar" value="false"/>
	<jsp:param name="jquery_fngantt" value="false"/>
	<jsp:param name="jquery_fixedtableheader" value="true"/>
	<jsp:param name="jquery_placeholder" value="true"/>
	<jsp:param name="jquery_iealert" value="false"/>
</jsp:include>
<script type="text/javascript">
function doClose() {
	jboxClose();
}
</script>
</head>
<body>
   <div class="mainright">
      <div class="content">
        <div class="title1 clearfix"></div>
        	<table class="xllist">
            	<thead>
	            	<tr>
	                   <th width="4%">序号</th>
	                   <th width="5%">操作人</th>
	                   <th width="10%">操作时间</th>
	                   <th width="5%">操作状态</th>
	                   <th>审核意见</th>
	               </tr>
              </thead>
              <tbody>
              	<c:forEach var="process" items="${processList}" varStatus="status">
					<tr>
						<td>${status.count}</td>
						<td>${process.operateUserName}</td>
						<td>${pdfn:transDate(process.createTime)}</td>
						<td>${process.operStatusName}</td>
						<td>${process.content}</td>
					</tr>
				</c:forEach>
              </tbody>
         </table> 
         <div class="button">
					<input type="button" class="search" value="关&#12288闭" onclick="doClose();">
		</div>  
     </div> 	
   </div>
</body>
</html>