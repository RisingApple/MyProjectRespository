package com.system.wms.dao;

import com.system.wms.pojo.OutMessage;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutMessage record);

    int insertSelective(OutMessage record);

    OutMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OutMessage record);

    int updateByPrimaryKey(OutMessage record);
}