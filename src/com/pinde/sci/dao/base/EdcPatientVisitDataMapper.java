package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EdcPatientVisitData;
import com.pinde.sci.model.mo.EdcPatientVisitDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdcPatientVisitDataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int countByExample(EdcPatientVisitDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByExample(EdcPatientVisitDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insert(EdcPatientVisitData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insertSelective(EdcPatientVisitData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	List<EdcPatientVisitData> selectByExample(EdcPatientVisitDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	EdcPatientVisitData selectByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExampleSelective(@Param("record") EdcPatientVisitData record,
			@Param("example") EdcPatientVisitDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExample(@Param("record") EdcPatientVisitData record,
			@Param("example") EdcPatientVisitDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKeySelective(EdcPatientVisitData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_PATIENT_VISIT_DATA
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKey(EdcPatientVisitData record);
}