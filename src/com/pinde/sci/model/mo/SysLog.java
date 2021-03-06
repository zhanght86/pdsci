package com.pinde.sci.model.mo;

import com.pinde.core.model.MybatisObject;

public class SysLog extends MybatisObject {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.LOG_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String logFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String userFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.USER_CODE
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String userCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.USER_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.ORG_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String orgFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.ORG_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String orgName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.DEPT_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String deptFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.DEPT_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String deptName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.REQ_TYPE_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String reqTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.REQ_TYPE_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String reqTypeName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.OPER_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String operName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.RESOURCE_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String resourceFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.LOG_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String logTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.LOG_DESC
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String logDesc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.WS_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String wsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.WS_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String wsName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.RECORD_STATUS
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String recordStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.CREATE_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.CREATE_USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String createUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.MODIFY_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String modifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.MODIFY_USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String modifyUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.SYS_LOG.OPER_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	private String operId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.LOG_FLOW
	 * @return  the value of PDSCI.SYS_LOG.LOG_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getLogFlow() {
		return logFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.LOG_FLOW
	 * @param logFlow  the value for PDSCI.SYS_LOG.LOG_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setLogFlow(String logFlow) {
		this.logFlow = logFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.USER_FLOW
	 * @return  the value of PDSCI.SYS_LOG.USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getUserFlow() {
		return userFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.USER_FLOW
	 * @param userFlow  the value for PDSCI.SYS_LOG.USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setUserFlow(String userFlow) {
		this.userFlow = userFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.USER_CODE
	 * @return  the value of PDSCI.SYS_LOG.USER_CODE
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.USER_CODE
	 * @param userCode  the value for PDSCI.SYS_LOG.USER_CODE
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.USER_NAME
	 * @return  the value of PDSCI.SYS_LOG.USER_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.USER_NAME
	 * @param userName  the value for PDSCI.SYS_LOG.USER_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.ORG_FLOW
	 * @return  the value of PDSCI.SYS_LOG.ORG_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getOrgFlow() {
		return orgFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.ORG_FLOW
	 * @param orgFlow  the value for PDSCI.SYS_LOG.ORG_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setOrgFlow(String orgFlow) {
		this.orgFlow = orgFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.ORG_NAME
	 * @return  the value of PDSCI.SYS_LOG.ORG_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.ORG_NAME
	 * @param orgName  the value for PDSCI.SYS_LOG.ORG_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.DEPT_FLOW
	 * @return  the value of PDSCI.SYS_LOG.DEPT_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getDeptFlow() {
		return deptFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.DEPT_FLOW
	 * @param deptFlow  the value for PDSCI.SYS_LOG.DEPT_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setDeptFlow(String deptFlow) {
		this.deptFlow = deptFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.DEPT_NAME
	 * @return  the value of PDSCI.SYS_LOG.DEPT_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.DEPT_NAME
	 * @param deptName  the value for PDSCI.SYS_LOG.DEPT_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.REQ_TYPE_ID
	 * @return  the value of PDSCI.SYS_LOG.REQ_TYPE_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getReqTypeId() {
		return reqTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.REQ_TYPE_ID
	 * @param reqTypeId  the value for PDSCI.SYS_LOG.REQ_TYPE_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setReqTypeId(String reqTypeId) {
		this.reqTypeId = reqTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.REQ_TYPE_NAME
	 * @return  the value of PDSCI.SYS_LOG.REQ_TYPE_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getReqTypeName() {
		return reqTypeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.REQ_TYPE_NAME
	 * @param reqTypeName  the value for PDSCI.SYS_LOG.REQ_TYPE_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setReqTypeName(String reqTypeName) {
		this.reqTypeName = reqTypeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.OPER_NAME
	 * @return  the value of PDSCI.SYS_LOG.OPER_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getOperName() {
		return operName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.OPER_NAME
	 * @param operName  the value for PDSCI.SYS_LOG.OPER_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setOperName(String operName) {
		this.operName = operName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.RESOURCE_FLOW
	 * @return  the value of PDSCI.SYS_LOG.RESOURCE_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getResourceFlow() {
		return resourceFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.RESOURCE_FLOW
	 * @param resourceFlow  the value for PDSCI.SYS_LOG.RESOURCE_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setResourceFlow(String resourceFlow) {
		this.resourceFlow = resourceFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.LOG_TIME
	 * @return  the value of PDSCI.SYS_LOG.LOG_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getLogTime() {
		return logTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.LOG_TIME
	 * @param logTime  the value for PDSCI.SYS_LOG.LOG_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.LOG_DESC
	 * @return  the value of PDSCI.SYS_LOG.LOG_DESC
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getLogDesc() {
		return logDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.LOG_DESC
	 * @param logDesc  the value for PDSCI.SYS_LOG.LOG_DESC
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.WS_ID
	 * @return  the value of PDSCI.SYS_LOG.WS_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getWsId() {
		return wsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.WS_ID
	 * @param wsId  the value for PDSCI.SYS_LOG.WS_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setWsId(String wsId) {
		this.wsId = wsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.WS_NAME
	 * @return  the value of PDSCI.SYS_LOG.WS_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getWsName() {
		return wsName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.WS_NAME
	 * @param wsName  the value for PDSCI.SYS_LOG.WS_NAME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setWsName(String wsName) {
		this.wsName = wsName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.RECORD_STATUS
	 * @return  the value of PDSCI.SYS_LOG.RECORD_STATUS
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.RECORD_STATUS
	 * @param recordStatus  the value for PDSCI.SYS_LOG.RECORD_STATUS
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.CREATE_TIME
	 * @return  the value of PDSCI.SYS_LOG.CREATE_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.CREATE_TIME
	 * @param createTime  the value for PDSCI.SYS_LOG.CREATE_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.CREATE_USER_FLOW
	 * @return  the value of PDSCI.SYS_LOG.CREATE_USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getCreateUserFlow() {
		return createUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.CREATE_USER_FLOW
	 * @param createUserFlow  the value for PDSCI.SYS_LOG.CREATE_USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setCreateUserFlow(String createUserFlow) {
		this.createUserFlow = createUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.MODIFY_TIME
	 * @return  the value of PDSCI.SYS_LOG.MODIFY_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.MODIFY_TIME
	 * @param modifyTime  the value for PDSCI.SYS_LOG.MODIFY_TIME
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.MODIFY_USER_FLOW
	 * @return  the value of PDSCI.SYS_LOG.MODIFY_USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getModifyUserFlow() {
		return modifyUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.MODIFY_USER_FLOW
	 * @param modifyUserFlow  the value for PDSCI.SYS_LOG.MODIFY_USER_FLOW
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setModifyUserFlow(String modifyUserFlow) {
		this.modifyUserFlow = modifyUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.SYS_LOG.OPER_ID
	 * @return  the value of PDSCI.SYS_LOG.OPER_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public String getOperId() {
		return operId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.SYS_LOG.OPER_ID
	 * @param operId  the value for PDSCI.SYS_LOG.OPER_ID
	 * @mbggenerated  Tue Apr 28 13:49:27 GMT+08:00 2015
	 */
	public void setOperId(String operId) {
		this.operId = operId;
	}
}