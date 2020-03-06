package com.team.house.housebackapp.util;

/**
 * @author 王建兵
 * @Classname PagePrameter
 * @Description TODO
 * @Date 2020/1/8 9:58
 * @Created by Administrator
 */
public class PagePrameter {
   private Integer page=1;
   private Integer pageSize=2;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
