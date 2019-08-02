package com.example.test.mapper;

import com.example.test.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name,String password);

}
