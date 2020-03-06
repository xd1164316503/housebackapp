package com.team.house.housebackapp.service;


import com.github.pagehelper.PageInfo;
import com.team.house.housebackapp.entity.House;
import com.team.house.housebackapp.util.HouseCondition;
import com.team.house.housebackapp.util.PagePrameter;

public interface HouseService {

        /**
         * 发布出租房
         * @param house  实体
         * @return 影响行数
         */
        public int addHouse(House house);

        /**
         * 查询某用户下所有出租房支持分页
         * @param uid 用户id
         * @param pagePrameter  传页码，页大小，
         * @return PageInfo
         */
        public PageInfo<House> getHouseByUserId(Integer uid, PagePrameter pagePrameter);

        //public PageInfo<House> getHouseByUserId(Integer page, Integer pageSize, Integer uid);
       /**
      * 删除发布的出租房
      * @param id
      * @return
      */
        public int deleteHouse(String id );

    /**
     * 搜索浏览出租房
     * @param houseCondition  搜索条件
     * @return 返回搜索的出租房
     */
    public PageInfo<House>  getBroswerHouse(HouseCondition houseCondition);

}
