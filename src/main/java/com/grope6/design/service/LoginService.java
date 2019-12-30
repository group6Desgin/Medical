package com.grope6.design.service;

import com.grope6.design.entity.Login;

import java.util.List;

public interface LoginService {
    //查询所有
    List<Login> findAll();

    //更新
    int updateLogin(Login login);

    //插入
    int insertLogin(Login login);

    //根据id查询
    Login findByUserId(String userId);

    //根据id删除
    int deleteByUserId(String userId);
}
