package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EduQuestion;
import com.pinde.sci.model.mo.EduQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduQuestionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int countByExample(EduQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int deleteByExample(EduQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int deleteByPrimaryKey(String questionFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int insert(EduQuestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int insertSelective(EduQuestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	List<EduQuestion> selectByExample(EduQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	EduQuestion selectByPrimaryKey(String questionFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int updateByExampleSelective(@Param("record") EduQuestion record,
			@Param("example") EduQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int updateByExample(@Param("record") EduQuestion record,
			@Param("example") EduQuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int updateByPrimaryKeySelective(EduQuestion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_QUESTION
	 * @mbggenerated  Fri Dec 05 16:00:32 CST 2014
	 */
	int updateByPrimaryKey(EduQuestion record);
}