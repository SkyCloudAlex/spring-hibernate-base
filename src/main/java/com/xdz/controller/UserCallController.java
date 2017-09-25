package com.xdz.controller;

import com.xdz.service.ActivityService;
import com.xdz.service.UserCallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Controller
@RequestMapping("/userCall")
public class UserCallController {

    public static final Logger logger = LoggerFactory.getLogger(UserCallController.class);

    @Resource(name = "userCallService")
    private UserCallService userCallService;

    @Resource(name = "activityService")
    private ActivityService activityService;

    @RequestMapping("/testSettingWork")
    @ResponseBody
    public void testSettingWork(){
        System.err.println("调用controller层的testSettingWork方法");
        userCallService.testSettingWork();
    }

    @RequestMapping("/watchMovie")
    @ResponseBody
    public void watchMovie(){
        activityService.watchMovie();
    }

    @RequestMapping("/workEveryDay")
    @ResponseBody
    public void workEveryDay(){
        activityService.workEveryDay();
    }

}
