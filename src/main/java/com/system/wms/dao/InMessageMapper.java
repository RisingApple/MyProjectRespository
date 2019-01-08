package com.system.wms.dao;

import com.system.wms.pojo.InMessage;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InMessageMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(InMessage record);

    int insertSelective(InMessage record);

    InMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InMessage record);

    int updateByPrimaryKey(InMessage record);
}