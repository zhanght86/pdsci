package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EduCourseSchedule;
import com.pinde.sci.model.mo.EduCourseScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseScheduleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int countByExample(EduCourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int deleteByExample(EduCourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int deleteByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int insert(EduCourseSchedule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int insertSelective(EduCourseSchedule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	List<EduCourseSchedule> selectByExample(EduCourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	EduCourseSchedule selectByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int updateByExampleSelective(@Param("record") EduCourseSchedule record,
			@Param("example") EduCourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int updateByExample(@Param("record") EduCourseSchedule record,
			@Param("example") EduCourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int updateByPrimaryKeySelective(EduCourseSchedule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDU_COURSE_SCHEDULE
	 * @mbggenerated  Thu Jul 30 14:27:50 CST 2015
	 */
	int updateByPrimaryKey(EduCourseSchedule record);
}