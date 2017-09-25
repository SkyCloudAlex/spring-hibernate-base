package com.xdz.service.impl;

import com.xdz.dao.UserDao;
import com.xdz.service.UserCallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service("userCallService")
public class UserCallServiceImpl implements UserCallService {

    public static final Logger logger = LoggerFactory.getLogger(UserCallServiceImpl.class);

    @Resource(name = "userDao")
    private UserDao userDao;

    public void testSettingWork(){
        System.err.println("调用service层的testSettingWork方法");
        userDao.testSettingWork();
    }

}
