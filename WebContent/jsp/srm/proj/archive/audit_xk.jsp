<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/jsp/common/doctype.jsp" %>
<html>
<head>
<jsp:include page="/jsp/common/htmlhead.jsp">
	<jsp:param name="basic" value="true"/>
	<jsp:param name="jbox" value="true"/>
	<jsp:param name="jquery_validation" value="true"/>
	<jsp:param name="jquery_placeholder" value="true"/>
</jsp:include>
<script type="text/javascript">
	function saveAudit(agreeFlag){
		if(agreeFlag=="${GlobalConstant.FLAG_Y}"){
			$('#sub').removeClass("validate[required,maxSize[200]]");
		}else{
			$('#sub').addClass("validate[required,maxSize[200]]");
		}
		var form = $('#projForm');
		if(false==form.validationEngine("validate")){
			return ;
		}
		var action = form.attr('action');
		action+='?result='+agreeFlag;
		var tip =  agreeFlag=="${GlobalConstant.FLAG_Y}"?"确认归档":"取消";
		jboxConfirm("确认"+tip+"?" ,  function(){
		jboxStartLoading();
		jboxPost(action ,  $('#projForm').serialize() , function(){
			window.parent.frames['mainIframe'].window.searchProj();
			doClose(); } , null , true);
		});
		}
	
	function doClose() {
		jboxClose();
	}
	
</script>

</head>
<body>
  	 <div class="mainright">
      <div class="content">
         <div class="title1 clearfix">
        	   <div>
        		<table>
        		<tr height="30px">
        			<td style="font-weight: bold;">学科名称：</td><td colspan="3"><a target="_blank" style="color:blue;" href="<s:url value='/srm/proj/mine/auditProjView?projFlow=${proj.projFlow}'/>">${proj.projName}</a></td>
        		</tr> 
        		<tr  height="30px">
        			<td style="font-weight: bold;">学科类型：</td>
        			<td width="200px">${proj.projTypeName}</td>
        			<td style="font-weight: bold;">起止时间：</td>
        			<td>${proj.projStartTime}~${proj.projEndTime}</td>
        		</tr>
        		<tr  height="30px">
        			<td style="font-weight: bold;">承担单位：</td>
        			<td>${proj.applyOrgName}</td>
        			<td style="font-weight: bold;">负责人：</td>
        			<td>${proj.applyUserName}</td>
        		</tr>
              </table>
              </div>
        </div>
          <hr/>
	  <div >
	<form id="projForm" action="<s:url value='/srm/proj/archive/saveAudit/${sessionScope.projListScope}/${sessionScope.projCateScope}'/>" method="post">
		  <table cellpadding="0" cellspacing="0" style="width: 100%">
        <tr>
            <td style="text-align: center">
                <table cellpadding="0" cellspacing="0" style="width: 100%">
                    <tr style="height: 25px; background-image: url(../css/skin/${skinPath}/images/top_bg.jpg); background-repeat: repeat-x">
	                        <td colspan="2" style="width: 100%; text-align: left">
	                            &#12288;&#12288;&#12288;<span style="font-weight: bold">学科审核信息：<font color="red"> 学科被退回时必须填写“审核意见”(最多200个字)</font></span>
	                        </td>
	                    </tr>
	                    <tr>
	                        <th style="width:17%">归档意见：</th>
	                        <td style="text-align: left;padding-left: 0px;">
	                            <textarea id="sub" name="sub"  class="validate[maxSize[200]] textbox"  rows="6" cols="20"  style="width:100%;resize :none" placeholder="请填写审核意见..."></textarea>
	                        </td>
	                    </tr>
	                    <tr>
	                        <td colspan="2" style="padding: 0px;">
	                       		 <input type="hidden" name="projFlow" value="${proj.projFlow }"/>
	                        </td>
	                    </tr>
	                     <tr>
                        	<td>
                      		  </td>
                        		<td  style="text-align:left;padding-top:5px;">
			                        <input class='search'   onclick="saveAudit('${GlobalConstant.FLAG_Y}')" type='button'  value='归&#12288;档' />  
       		    						<%--  <input class='search' onclick="saveAudit('${GlobalConstant.FLAG_N}')" type='button' value='不归档'/> --%>
			                     </td>
                   	 </tr>
	                </table>
	            </td>
	        </tr>
	    </table>
	  
    </form>
     </div>
     </div>
     </div>
              
	
   
</body>

</html>