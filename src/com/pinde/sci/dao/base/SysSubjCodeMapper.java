package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.SysSubjCode;
import com.pinde.sci.model.mo.SysSubjCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSubjCodeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int countByExample(SysSubjCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByExample(SysSubjCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByPrimaryKey(String subjFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insert(SysSubjCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insertSelective(SysSubjCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	List<SysSubjCode> selectByExample(SysSubjCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	SysSubjCode selectByPrimaryKey(String subjFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExampleSelective(@Param("record") SysSubjCode record,
			@Param("example") SysSubjCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExample(@Param("record") SysSubjCode record,
			@Param("example") SysSubjCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKeySelective(SysSubjCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SYS_SUBJ_CODE
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKey(SysSubjCode record);
}