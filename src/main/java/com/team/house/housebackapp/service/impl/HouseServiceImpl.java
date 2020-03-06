package com.team.house.housebackapp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.housebackapp.entity.House;
import com.team.house.housebackapp.mapper.HouseMapper;
import com.team.house.housebackapp.service.HouseService;
import com.team.house.housebackapp.util.HouseCondition;
import com.team.house.housebackapp.util.PagePrameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

        @Autowired(required =false)
        private HouseMapper houseMapper;
        @Override
        public int addHouse(House house) {
            return houseMapper.insertSelective(house);
        }

        @Override
        public PageInfo<House> getHouseByUserId(Integer uid, PagePrameter pagePrameter) {
                //开启分页
                PageHelper.startPage(pagePrameter.getPage(),pagePrameter.getPageSize());
                //查询所有
                List<House> list=houseMapper.getHouseByUser(uid);
                //返回分页相关信息
                return new PageInfo<>(list);
        }

    @Override
    public int deleteHouse(String id) {
        return houseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<House> getBroswerHouse(HouseCondition houseCondition) {
        //开启分页
        PageHelper.startPage(houseCondition.getPage(),houseCondition.getPageSize());
        //调持久化操作查询所有
        List<House> list=houseMapper.getBroswerHouse(houseCondition);
        //获取分页信息
        return new PageInfo<>(list);
    }


}
