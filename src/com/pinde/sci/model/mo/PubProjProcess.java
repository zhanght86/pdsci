package com.pinde.sci.model.mo;

import com.pinde.core.model.MybatisObject;

public class PubProjProcess extends MybatisObject {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROCESS_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String processFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROJ_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String projFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String projStageId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String projStageName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String projStatusId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String projStatusName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.REC_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String recFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.REC_TYPE_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String recTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.REC_TYPE_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String recTypeName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.PROCESS_REMARK
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String processRemark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.AUDIT_CONTENT
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String auditContent;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.OPER_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String operUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.OPER_USER_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String operUserName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.OPER_ORG_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String operOrgFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.OPER_ORG_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String operOrgName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.OPER_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String operTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.RECORD_STATUS
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String recordStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.CREATE_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.CREATE_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String createUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.MODIFY_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String modifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.PUB_PROJ_PROCESS.MODIFY_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	private String modifyUserFlow;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROCESS_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROCESS_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProcessFlow() {
		return processFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROCESS_FLOW
	 * @param processFlow  the value for PDSCI.PUB_PROJ_PROCESS.PROCESS_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProcessFlow(String processFlow) {
		this.processFlow = processFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROJ_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProjFlow() {
		return projFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_FLOW
	 * @param projFlow  the value for PDSCI.PUB_PROJ_PROCESS.PROJ_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProjFlow(String projFlow) {
		this.projFlow = projFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_ID
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProjStageId() {
		return projStageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_ID
	 * @param projStageId  the value for PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProjStageId(String projStageId) {
		this.projStageId = projStageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_NAME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProjStageName() {
		return projStageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_NAME
	 * @param projStageName  the value for PDSCI.PUB_PROJ_PROCESS.PROJ_STAGE_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProjStageName(String projStageName) {
		this.projStageName = projStageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_ID
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProjStatusId() {
		return projStatusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_ID
	 * @param projStatusId  the value for PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProjStatusId(String projStatusId) {
		this.projStatusId = projStatusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_NAME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProjStatusName() {
		return projStatusName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_NAME
	 * @param projStatusName  the value for PDSCI.PUB_PROJ_PROCESS.PROJ_STATUS_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProjStatusName(String projStatusName) {
		this.projStatusName = projStatusName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.REC_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.REC_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getRecFlow() {
		return recFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.REC_FLOW
	 * @param recFlow  the value for PDSCI.PUB_PROJ_PROCESS.REC_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setRecFlow(String recFlow) {
		this.recFlow = recFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.REC_TYPE_ID
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.REC_TYPE_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getRecTypeId() {
		return recTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.REC_TYPE_ID
	 * @param recTypeId  the value for PDSCI.PUB_PROJ_PROCESS.REC_TYPE_ID
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setRecTypeId(String recTypeId) {
		this.recTypeId = recTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.REC_TYPE_NAME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.REC_TYPE_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getRecTypeName() {
		return recTypeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.REC_TYPE_NAME
	 * @param recTypeName  the value for PDSCI.PUB_PROJ_PROCESS.REC_TYPE_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setRecTypeName(String recTypeName) {
		this.recTypeName = recTypeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.PROCESS_REMARK
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.PROCESS_REMARK
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getProcessRemark() {
		return processRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.PROCESS_REMARK
	 * @param processRemark  the value for PDSCI.PUB_PROJ_PROCESS.PROCESS_REMARK
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setProcessRemark(String processRemark) {
		this.processRemark = processRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.AUDIT_CONTENT
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.AUDIT_CONTENT
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getAuditContent() {
		return auditContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.AUDIT_CONTENT
	 * @param auditContent  the value for PDSCI.PUB_PROJ_PROCESS.AUDIT_CONTENT
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setAuditContent(String auditContent) {
		this.auditContent = auditContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_USER_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.OPER_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getOperUserFlow() {
		return operUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_USER_FLOW
	 * @param operUserFlow  the value for PDSCI.PUB_PROJ_PROCESS.OPER_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setOperUserFlow(String operUserFlow) {
		this.operUserFlow = operUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_USER_NAME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.OPER_USER_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getOperUserName() {
		return operUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_USER_NAME
	 * @param operUserName  the value for PDSCI.PUB_PROJ_PROCESS.OPER_USER_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setOperUserName(String operUserName) {
		this.operUserName = operUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_ORG_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.OPER_ORG_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getOperOrgFlow() {
		return operOrgFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_ORG_FLOW
	 * @param operOrgFlow  the value for PDSCI.PUB_PROJ_PROCESS.OPER_ORG_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setOperOrgFlow(String operOrgFlow) {
		this.operOrgFlow = operOrgFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_ORG_NAME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.OPER_ORG_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getOperOrgName() {
		return operOrgName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_ORG_NAME
	 * @param operOrgName  the value for PDSCI.PUB_PROJ_PROCESS.OPER_ORG_NAME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setOperOrgName(String operOrgName) {
		this.operOrgName = operOrgName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_TIME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.OPER_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getOperTime() {
		return operTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.OPER_TIME
	 * @param operTime  the value for PDSCI.PUB_PROJ_PROCESS.OPER_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.RECORD_STATUS
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.RECORD_STATUS
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.RECORD_STATUS
	 * @param recordStatus  the value for PDSCI.PUB_PROJ_PROCESS.RECORD_STATUS
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.CREATE_TIME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.CREATE_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.CREATE_TIME
	 * @param createTime  the value for PDSCI.PUB_PROJ_PROCESS.CREATE_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.CREATE_USER_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.CREATE_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getCreateUserFlow() {
		return createUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.CREATE_USER_FLOW
	 * @param createUserFlow  the value for PDSCI.PUB_PROJ_PROCESS.CREATE_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setCreateUserFlow(String createUserFlow) {
		this.createUserFlow = createUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.MODIFY_TIME
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.MODIFY_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.MODIFY_TIME
	 * @param modifyTime  the value for PDSCI.PUB_PROJ_PROCESS.MODIFY_TIME
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.PUB_PROJ_PROCESS.MODIFY_USER_FLOW
	 * @return  the value of PDSCI.PUB_PROJ_PROCESS.MODIFY_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public String getModifyUserFlow() {
		return modifyUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.PUB_PROJ_PROCESS.MODIFY_USER_FLOW
	 * @param modifyUserFlow  the value for PDSCI.PUB_PROJ_PROCESS.MODIFY_USER_FLOW
	 * @mbggenerated  Thu Aug 21 17:48:24 CST 2014
	 */
	public void setModifyUserFlow(String modifyUserFlow) {
		this.modifyUserFlow = modifyUserFlow;
	}
}