package com.xdz.controller;

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

    @RequestMapping("/testSettingWork")
    @ResponseBody
    public void testSettingWork(){
        System.err.println("测试");
        userCallService.testSettingWork();
    }

}
