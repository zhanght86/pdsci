package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.SchDept;
import com.pinde.sci.model.mo.SchDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchDeptMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int countByExample(SchDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int deleteByExample(SchDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int deleteByPrimaryKey(String schDeptFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int insert(SchDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int insertSelective(SchDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	List<SchDept> selectByExample(SchDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	SchDept selectByPrimaryKey(String schDeptFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int updateByExampleSelective(@Param("record") SchDept record,
			@Param("example") SchDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int updateByExample(@Param("record") SchDept record,
			@Param("example") SchDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int updateByPrimaryKeySelective(SchDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SCH_DEPT
	 * @mbggenerated  Tue May 12 16:32:30 CST 2015
	 */
	int updateByPrimaryKey(SchDept record);
}