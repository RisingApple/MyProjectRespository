package com.system.wms.dao;

import com.system.wms.pojo.Goods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

   
    int insert(Goods record);

   
    int insertSelective(Goods record);

    

    
    Goods selectByPrimaryKey(Integer id);

    

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Dec 23 19:30:19 CST 2018
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Dec 23 19:30:19 CST 2018
     */
    int updateByPrimaryKey(Goods record);
}