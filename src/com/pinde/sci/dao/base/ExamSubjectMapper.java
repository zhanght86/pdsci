package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.ExamSubject;
import com.pinde.sci.model.mo.ExamSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamSubjectMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int countByExample(ExamSubjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int deleteByExample(ExamSubjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int deleteByPrimaryKey(String subjectFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int insert(ExamSubject record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int insertSelective(ExamSubject record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	List<ExamSubject> selectByExample(ExamSubjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	ExamSubject selectByPrimaryKey(String subjectFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int updateByExampleSelective(@Param("record") ExamSubject record,
			@Param("example") ExamSubjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int updateByExample(@Param("record") ExamSubject record,
			@Param("example") ExamSubjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int updateByPrimaryKeySelective(ExamSubject record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_SUBJECT
	 * @mbggenerated  Tue Aug 11 10:59:32 CST 2015
	 */
	int updateByPrimaryKey(ExamSubject record);
}