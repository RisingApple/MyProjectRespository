package com.system.wms.dao;

import com.system.wms.pojo.InList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InListMapper {
    
    int deleteByPrimaryKey(Integer id);

    int insert(InList record);

    int insertSelective(InList record);

   
    InList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InList record);

    int updateByPrimaryKey(InList record);
}