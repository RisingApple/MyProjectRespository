package com.system.wms.dao;

import com.system.wms.pojo.LostReport;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LostReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LostReport record);

    int insertSelective(LostReport record);


    LostReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LostReport record);

    int updateByPrimaryKey(LostReport record);
}