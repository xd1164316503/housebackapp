package com.team.house.housebackapp.mapper;

import com.team.house.housebackapp.entity.House;
import com.team.house.housebackapp.entity.HouseExample;
import com.team.house.housebackapp.util.HouseCondition;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    //通过用户编号查询当前用户下的出租房
//修改House实体，添加类型名称tname、区域名称dname、街道名称sname
    List<House> getHouseByUser(Integer id);
    //浏览出租房(搜索)
    List<House> getBroswerHouse(HouseCondition houseCondition);

}