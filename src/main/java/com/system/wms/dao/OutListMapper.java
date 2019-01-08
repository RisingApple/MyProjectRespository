package com.system.wms.dao;

import com.system.wms.pojo.OutList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutListMapper {
    OutList selectById(Integer id);
}