package com.team.house.housebackapp.service.impl;


import com.team.house.housebackapp.entity.Type;
import com.team.house.housebackapp.entity.TypeExample;
import com.team.house.housebackapp.mapper.TypeMapper;
import com.team.house.housebackapp.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired(required = false)
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAllType() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
