<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>湖北省住院医师规范化培训招录系统</title>
<jsp:include page="/jsp/hbres/htmlhead-hbres.jsp">
	<jsp:param name="basic" value="true"/>
	<jsp:param name="jbox" value="true"/>
	<jsp:param name="font" value="true"/>
</jsp:include>
<script>
$(document).ready(function(){
	$(".menu_item a").click(function(){
		$(".select").removeClass("select");
		$(this).addClass("select");
	});
	setBodyHeight();
});
function audit(statusId,key,currentPage){
	if(!currentPage){
		currentPage = 1;
	}
	$("#auditItem").addClass("select");
	var data="statusId="+statusId+"&currentPage="+currentPage+"&key="+key;
	jboxPostLoad("content","<s:url value='/hbres/singup/manage/audit'/>",data,true);
}
/**
 * 成绩录入
 */
function gradeInput(currentPage){
	if(!currentPage){
		currentPage = 1;
	}
	var url = "<s:url value='/hbres/grade/input'/>?currentPage="+currentPage;
	jboxPostLoad("content", url, $("#examResultForm").serialize(), true);
}
/**
 * 安全中心
 */
function accounts(){
	jboxLoad("content","<s:url value='/hbres/singup/accounts'/>",true);
}
/**
 * 公告
 */
function notice(currentPage){
	if(!currentPage){
		currentPage = 1;
	}
	jboxLoad("content","<s:url value='/hbres/singup/noticemanage?currentPage='/>"+currentPage,true);
}
/**
 * 基地维护
 */
function org(isY,id){
	jboxLoad("content","<s:url value='/hbres/singup/manage/orgCfg'/>?isCountry="+isY+"&id="+id,true);
}
/**
 * 招录计划
 */
function planList(assignYear){
	jboxLoad("content","<s:url value='/hbres/singup/manage/plan'/>?assignYear="+assignYear,true);
}
/**
 * 专业维护
 */
function spe(){
	jboxLoad("content","<s:url value='/hbres/singup/spe'/>",true);
}
function toPage(page) {
	if(page!=undefined){
		$("#currentPage").val(page);			
	}
	window.location.href="<s:url value='/hbres/singup/manage/global'/>?currentPage="+$("#currentPage").val();
} 

/**
 * 招录设置
 */
function cfg() {
	jboxLoad("content","<s:url value='/hbres/singup/manage/datecfg'/>",true);
}

/**
 * 考试安排
 */
function examPlan(){
	jboxLoad("content","<s:url value='/hbres/singup/exam/plan'/>",true);
}
/**
 * 参考人员
 */
function setExamUser(){
	jboxLoad("content","<s:url value='/hbres/singup/exam/setexamuser'/>",true);
}
/**
 * 考点安排
 */
function examSitePlan(){
	jboxLoad("content","<s:url value='/hbres/singup/exam/siteplan'/>",true);
}
/**
 * 考场分配
 */
function examRoomManage(siteFlow){
	jboxLoad("content","<s:url value='/hbres/singup/exam/roommanage'/>?siteFlow="+siteFlow,true);
}
/**
 * 参加考试的人员信息
 */
function examUser(){
	jboxLoad("content","<s:url value='/hbres/singup/exam/users'/>",true);
}
function examPrint(){
	jboxLoad("content","<s:url value='/hbres/singup/exam/print'/>",true);
}

/**
 * 分数线划定
 */
function setGradeLine(){
	jboxLoad("content","<s:url value='/hbres/grade/gradeline'/>",true);
}


/**
 * 住培学员注册登记表
 */
function registerList(currentPage){
	if(!currentPage){
		currentPage = 1;
	}
	var orgFlow = $("select[name='orgFlow']").val();
	if(!orgFlow){
		orgFlow = "";
	}
	var url = "<s:url value='/hbres/grade/registerList'/>?currentPage="+ currentPage +"&orgFlow=" + orgFlow;
	jboxLoad("content", url, true);
}

/**
 * 住培注册学员统计表
 */
function registerStatistics(){
	var orgFlow = $("select[name='orgFlow']").val();
	if(!orgFlow){
		orgFlow = "";
	}
	var url = "<s:url value='/hbres/grade/registerStatistics'/>?orgFlow=" + orgFlow;
	jboxLoad("content", url, true);
}

/**
 * 录取考试成绩排序表
 */
function recruitResultList(currentPage){
	if(!currentPage){
		currentPage = 1;
	}
	var orgFlow = $("select[name='orgFlow']").val();
	if(!orgFlow){
		orgFlow = "";
	}
	var url = "<s:url value='/hbres/grade/recruitResultList'/>?currentPage="+currentPage +"&orgFlow=" + orgFlow;
	jboxLoad("content", url, true);
}

function setBodyHeight(){
	if (navigator.appName.indexOf("Microsoft Internet Explorer")>-1) {//处理ie浏览器placeholder和password的不兼容问题
		if(navigator.appVersion.indexOf("MSIE 7.0")>-1){
			$("#indexBody").css("height",window.innerHeight+"px");
		}else if(navigator.appVersion.indexOf("MSIE 8.0")>-1){
			$("#indexBody").css("height",document.documentElement.offsetHeight+"px");
		}else{
			$("#indexBody").css("height",window.innerHeight+"px");
		}
    } else {
    	$("#indexBody").css("height",window.innerHeight+"px");
    }
}

onresize=function(){
	setBodyHeight();
}
function adminMod(){
	var url = "<s:url value='/hbres/singup/adminMod'/>";
	jboxLoad("content", url, true);
}

function resMain(){
	window.open("<s:url value='/hbres/singup/login'/>?userFlow=${sessionScope.currUser.userFlow}");
}
</script>
<style>
body{overflow:hidden;}
</style>
</head>

<body>
<div style="overflow:auto;" id="indexBody">
<div class="bd_bg">
<div class="yw">
 <jsp:include page="/jsp/hbres/head.jsp">
    <jsp:param value="/hbres/singup/manage/global" name="indexUrl"/>
</jsp:include>

 <div class="body">
   <div class="container">
     <div class="content_side">
        <dl class="menu menu_first">
          <dt class="menu_title">
            <i class="icon_menu menu_function"></i>审核
          </dt>
          <dd class="menu_item" ><a id="auditItem" href="javascript:audit('${regStatusEnumPassing.id }','','');">报名审核</a></dd>
        </dl>
        <dl class="menu">
          <dt class="menu_title">
            <i class="icon_menu menu_management"></i>管理
          </dt>
          <dd class="menu_item"><a href="javascript:examPlan();">考试管理</a></dd>
          <dd class="menu_item"><a href="javascript:gradeInput();">成绩录入</a></dd>
          <dd class="menu_item"><a href="javascript:setGradeLine();">分数划定</a></dd>
          <c:if test="${GlobalConstant.FLAG_Y eq applicationScope.sysCfgMap['res_hbres_on'] }">
          <dd class="menu_item"><a href="javascript:resMain();">过程管理</a></dd>
          </c:if>
          <!-- 
          <dd class="menu_item"><a href="#">招录管理</a></dd>
          <dd class="menu_item"><a href="#">调剂管理</a></dd>
           -->
        </dl>
        <dl class="menu">
          <dt class="menu_title">
            <i class="icon_menu menu_statistics"></i>统计
            <!-- 
            <i class="new"></i> -->
          </dt>
          <c:set value="${sysCfgMap['res_reg_year']}" var="year"/>
          <dd class="menu_item"><a href="javascript:planList('${year}');">住培招录计划</a></dd>
          <dd class="menu_item"><a href="javascript:registerList();">住培学员注册登记表</a></dd>
          <dd class="menu_item"><a href="javascript:registerStatistics();">住培注册学员统计表</a></dd>
          <dd class="menu_item"><a href="javascript:recruitResultList();">录取考试成绩排序表</a></dd>
        </dl>
        <dl class="menu">
          <dt class="menu_title">
            <i class="icon_menu menu_setup"></i>设置
          </dt>
           <dd class="menu_item"><a href="javascript:notice();">公告维护</a></dd>
           <dd class="menu_item"><a href="javascript:org('','');">基地维护</a></dd>
           <dd class="menu_item"><a href="javascript:spe();">专业维护</a></dd>
           <dd class="menu_item"><a href="javascript:cfg();">招录设置</a></dd>
           <dd class="menu_item"><a href="javascript:accounts();">安全中心</a></dd>
           <c:if test="${sessionScope.currUser.userCode eq 'admin' && false }">
           <dd class="menu_item"><a href="javascript:adminMod();">后台修改</a></dd>
           </c:if>
        </dl>
     </div>
     <div class="col_main" id="content">
       <div class="content_main">
         <div class="index_show">
          <div class="index_tap top_left">
            <ul class="inner">
              <li class="index_item index_blue">
                <a href="javascript:audit('${regStatusEnumPassing.id }' , '' , '');">
                  <span class="tap_inner">
                    <i class="index_message"></i>
                    <em class="number">${regCount }</em>
                    <strong  class="title">待审核</strong>
                  </span>
                </a>
              </li>
              <li class="index_item index_blue">
                <a href="#" style="cursor: default;">
                  <span class="tap_inner tab_second">
                    <i class="people"></i>
                    <em class="number">${totleCount }</em>
                    <strong  class="title">已报名数</strong>
                  </span>
                </a>
              </li>
            </ul>
          </div>
          <div class="index_tap top_right">
            <ul class="inner">
              <li class="index_item index_green">
                <a href="javascript:audit('${regStatusEnumPassed.id }' , '' , '');">
                  <span class="tap_inner">
                    <i class="crowd"></i>
                    <em class="number">${activatedCount }</em>
                    <strong  class="title">审核通过数</strong>
                  </span>
                </a>
              </li>
            </ul>
          </div>
        </div>
         <div class="index_form">
          <h3>系统公告</h3>
          <ul class="form_main">
          	<c:forEach items="${messages}" var="msg">
            <li>
            <a>
            <strong><a href="<s:url value='/hbres/notice/view'/>?infoFlow=${msg.infoFlow}" target="_blank">${msg.infoTitle }</a>
            <c:if test="${pdfn:signDaysBetweenTowDate(pdfn:getCurrDate(),pdfn:transDate(msg.infoTime))<=7}">
            	<i class="new1"></i>
            </c:if>
            </strong>
            <span>${pdfn:transDate(msg.infoTime) }</span>
            </a>
            </li>
            </c:forEach>
          </ul>
        </div>
         <div class="page" style="padding-right: 40px;">
       	 <input id="currentPage" type="hidden" name="currentPage" value=""/>
           <c:set var="pageView" value="${pdfn:getPageView(messages)}" scope="request"></c:set>
	  		 <pd:pagination-hbres toPage="toPage"/>	 
        </div>
       </div>
     </div>
   </div>
 </div>
</div>
</div>
 
<c:if test="${applicationScope.sysCfgMap['online_service']=='Y'}">
    <jsp:include page="/jsp/service.jsp"></jsp:include>
</c:if>
<jsp:include page="/jsp/hbres/foot.jsp" />
</div>
</body>
</html>

