package com.team.house.housebackapp.service;


import com.team.house.housebackapp.entity.Users;

public interface UserService {

        //注册业务
        public int regUser(Users users);

        //登入
        public Users Login(String username,String password);


}
