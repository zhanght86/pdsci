package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.ResExamDoctor;
import com.pinde.sci.model.mo.ResExamDoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResExamDoctorMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int countByExample(ResExamDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int deleteByExample(ResExamDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int deleteByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int insert(ResExamDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int insertSelective(ResExamDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	List<ResExamDoctor> selectByExample(ResExamDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	ResExamDoctor selectByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int updateByExampleSelective(@Param("record") ResExamDoctor record,
			@Param("example") ResExamDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int updateByExample(@Param("record") ResExamDoctor record,
			@Param("example") ResExamDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int updateByPrimaryKeySelective(ResExamDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_DOCTOR
	 * @mbggenerated  Tue Mar 24 16:16:44 GMT+08:00 2015
	 */
	int updateByPrimaryKey(ResExamDoctor record);
}