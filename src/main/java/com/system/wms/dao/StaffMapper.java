package com.system.wms.dao;

import com.system.wms.pojo.Staff;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    Staff selectByAccount(String account);
    void insert(Staff staff);
}