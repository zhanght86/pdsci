package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EdcInspect;
import com.pinde.sci.model.mo.EdcInspectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdcInspectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int countByExample(EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int deleteByExample(EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int deleteByPrimaryKey(String projFlow);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int insert(EdcInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int insertSelective(EdcInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    List<EdcInspect> selectByExampleWithBLOBs(EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    List<EdcInspect> selectByExample(EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    EdcInspect selectByPrimaryKey(String projFlow);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int updateByExampleSelective(@Param("record") EdcInspect record, @Param("example") EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int updateByExampleWithBLOBs(@Param("record") EdcInspect record, @Param("example") EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int updateByExample(@Param("record") EdcInspect record, @Param("example") EdcInspectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int updateByPrimaryKeySelective(EdcInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int updateByPrimaryKeyWithBLOBs(EdcInspect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDC_INSPECT
     *
     * @mbggenerated Fri Dec 12 09:41:21 GMT+08:00 2014
     */
    int updateByPrimaryKey(EdcInspect record);
}