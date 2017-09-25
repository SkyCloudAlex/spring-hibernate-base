package com.xdz.service.impl;

import com.xdz.service.ActivityService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    /**
     * 看电影
     */
    public void watchMovie(){
        System.err.println("用户正在看电影");
    }

}
