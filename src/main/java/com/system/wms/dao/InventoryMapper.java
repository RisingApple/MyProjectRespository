package com.system.wms.dao;

import com.system.wms.pojo.Inventory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryMapper {
   
    int deleteByPrimaryKey(Integer id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}