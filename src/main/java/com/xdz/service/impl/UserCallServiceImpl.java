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
        System.err.println("����service���testSettingWork����");
        userDao.testSettingWork();
    }

    //_______���´����Ƕ�AOP��һЩ����_______

    @Pointcut("execution(* com.xdz.service.impl.ActivityServiceImpl.watchMovie())")
    public void currentPointCut(){

    }

    /**
     * ��Ʊ
     */
    @Before("currentPointCut()")
    public void buyTicket(){
        System.err.println("�û���Ʊ");
    }

    /**
     * ��ˮ
     */
    @Before("currentPointCut()")
    public void buyWater(){
        System.err.println("�û���ˮ");
    }

    /**
     * ȥ��ӰԺ
     */
    @Before("currentPointCut()")
    public void gotoCineme(){
        System.err.println("ȥ��ӰԺ");
    }

    /**
     * �뿪��ӰԺ
     */
    @After("currentPointCut()")
    public void leavecineme(){
        System.err.println("�뿪��ӰԺ");
    }

    /**
     * ������
     */
    @After("currentPointCut()")
    public void droplitter(){
        System.err.println("������");
    }

}
