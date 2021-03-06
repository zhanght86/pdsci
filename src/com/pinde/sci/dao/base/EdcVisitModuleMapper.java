package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EdcVisitModule;
import com.pinde.sci.model.mo.EdcVisitModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdcVisitModuleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int countByExample(EdcVisitModuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int deleteByExample(EdcVisitModuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int deleteByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int insert(EdcVisitModule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int insertSelective(EdcVisitModule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	List<EdcVisitModule> selectByExample(EdcVisitModuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	EdcVisitModule selectByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int updateByExampleSelective(@Param("record") EdcVisitModule record,
			@Param("example") EdcVisitModuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int updateByExample(@Param("record") EdcVisitModule record,
			@Param("example") EdcVisitModuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int updateByPrimaryKeySelective(EdcVisitModule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_VISIT_MODULE
	 * @mbggenerated  Fri Oct 10 14:51:05 CST 2014
	 */
	int updateByPrimaryKey(EdcVisitModule record);
}