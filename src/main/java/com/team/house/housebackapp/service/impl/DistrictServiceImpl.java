package com.team.house.housebackapp.service.impl;


import com.team.house.housebackapp.entity.District;
import com.team.house.housebackapp.entity.DistrictExample;
import com.team.house.housebackapp.mapper.DistrictMapper;
import com.team.house.housebackapp.mapper.TypeMapper;
import com.team.house.housebackapp.service.DistrictService;
import net.sf.jsqlparser.statement.select.Distinct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
      @Autowired(required = false)
    private  DistrictMapper districtMapper;


    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }

}
