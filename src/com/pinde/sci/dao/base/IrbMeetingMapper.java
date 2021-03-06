package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.IrbMeeting;
import com.pinde.sci.model.mo.IrbMeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IrbMeetingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int countByExample(IrbMeetingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByExample(IrbMeetingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByPrimaryKey(String meetingFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insert(IrbMeeting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insertSelective(IrbMeeting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	List<IrbMeeting> selectByExample(IrbMeetingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	IrbMeeting selectByPrimaryKey(String meetingFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExampleSelective(@Param("record") IrbMeeting record,
			@Param("example") IrbMeetingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExample(@Param("record") IrbMeeting record,
			@Param("example") IrbMeetingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKeySelective(IrbMeeting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.IRB_MEETING
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKey(IrbMeeting record);
}