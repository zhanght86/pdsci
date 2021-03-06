package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EdcQuery;
import com.pinde.sci.model.mo.EdcQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdcQueryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int countByExample(EdcQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByExample(EdcQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByPrimaryKey(String queryFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insert(EdcQuery record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insertSelective(EdcQuery record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	List<EdcQuery> selectByExample(EdcQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	EdcQuery selectByPrimaryKey(String queryFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExampleSelective(@Param("record") EdcQuery record,
			@Param("example") EdcQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExample(@Param("record") EdcQuery record,
			@Param("example") EdcQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKeySelective(EdcQuery record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_QUERY
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKey(EdcQuery record);
}