<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
function add() {
	jboxOpen("<s:url value='/jsp/aem/apply/edit.jsp'/>","新增实验信息", 900, 500);
}
</script>
</head>
<body>
	<div class="mainright">
		<div class="content">
			<div class="title1 clearfix">
				 <form id="searchForm" action="<s:url value="/sys/user/list/${sessionScope.userListScope}" />" method="post" > 
				     	实验名称：<input type="text" name="userName" value="${param.userName}"  class="xltext"/>  						
				     	<input type="button" class="search" onclick="searchUser();" value="查&#12288;询">
				     	<input type="button" class="search" onclick="add();" value="申请实验">
				</form>
			</div>
	<table class="xllist" > 
		<tr>
			<th width="20px"></th>
			<th width="50px">实验名称</th>
			<th width="50px">动物</th>
			<th width="30px">数量</th>
			<th width="60px">实验期限</th>
			<th width="100px">预计开始时间</th>
			<th width="120px">状态</th>
			<th width="120px">操作</th>
		</tr>
		<tr>			
			<td></td>
			<td>***实验1</td>
			<td>小白鼠</td>
			<td>1只</td>
			<td>2014-06-15</td>
			<td>2014-06-08</td>
			<td>未提交</td>
			<td>提交</td>
		</tr>
		<tr>			
			<td></td>
			<td>***实验2</td>
			<td>小白鼠</td>
			<td>2只</td>
			<td>2014-06-15</td>
			<td>2014-06-08</td>
			<td>待审核</td>
			<td></td>
		</tr>
		<tr>			
			<td></td>
			<td>***实验3</td>
			<td>小白鼠</td>
			<td>3只</td>
			<td>2014-06-15</td>
			<td>2014-06-08</td>
			<td>审核通过</td>
			<td></td>
		</tr>		
		<tr>			
			<td></td>
			<td>***实验4</td>
			<td>小白鼠</td>
			<td>4只</td>
			<td>2014-06-15</td>
			<td>2014-06-08</td>
			<td>审核未通过</td>
			<td>未通过原因</td>
		</tr>
	</table>
	</div>
</div>
</body>
</html>