package com.xdz.dao.impl;

import com.xdz.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public void testSettingWork(){
        System.err.println("调用dao层的testSettingWork方法");
    }

}
