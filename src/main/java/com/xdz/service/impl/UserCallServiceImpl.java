package com.xdz.service.impl;

import com.xdz.dao.UserDao;
import com.xdz.service.UserCallService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service("userCallService")
@Aspect
public class UserCallServiceImpl implements UserCallService {

    public static final Logger logger = LoggerFactory.getLogger(UserCallServiceImpl.class);

    @Resource(name = "userDao")
    private UserDao userDao;

    public void testSettingWork(){
        System.err.println("调用service层的testSettingWork方法");
        userDao.testSettingWork();
    }

    //_______以下代码是对AOP的一些测试_______

    @Pointcut("execution(* com.xdz.service.impl.ActivityServiceImpl.watchMovie())")
    public void currentPointCut(){

    }

    /**
     * 买票
     */
    @Before("currentPointCut()")
    public void buyTicket(){
        System.err.println("用户买票");
    }

    /**
     * 买水
     */
    @Before("currentPointCut()")
    public void buyWater(){
        System.err.println("用户买水");
    }

    /**
     * 去电影院
     */
    @Before("currentPointCut()")
    public void gotoCineme(){
        System.err.println("去电影院");
    }

    /**
     * 离开电影院
     */
    @After("currentPointCut()")
    public void leavecineme(){
        System.err.println("离开电影院");
    }

    /**
     * 扔垃圾
     */
    @After("currentPointCut()")
    public void droplitter(){
        System.err.println("扔垃圾");
    }

}
