package com.xdz.service.impl;

import com.xdz.service.ActivityService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    /**
     * ����Ӱ
     */
    public void watchMovie(){
        System.err.println("�û����ڿ���Ӱ");
    }

    public void workEveryDay(){
        System.err.println("����ÿ��Ĺ���");
        throw new RuntimeException("·��������");
    }



}
