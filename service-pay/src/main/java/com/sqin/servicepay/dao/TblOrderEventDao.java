package com.sqin.servicepay.dao;

import com.sqin.servicepay.entity.TblOrderEvent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblOrderEventDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TblOrderEvent record);

    int insertSelective(TblOrderEvent record);

    TblOrderEvent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblOrderEvent record);

    int updateByPrimaryKey(TblOrderEvent record);
}
