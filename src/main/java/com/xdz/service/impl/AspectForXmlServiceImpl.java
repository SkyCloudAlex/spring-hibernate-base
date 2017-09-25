package com.xdz.service.impl;

import com.xdz.service.AspectForXmlService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service("aspectForXmlServiceImpl")
public class AspectForXmlServiceImpl {

    public void getUp(){
        System.err.println(" --- 起床 --- ");
    }

    public void washfaceAndTeeth(){
        System.err.println(" --- 洗脸刷牙 --- ");
    }

    public void byUnderGroundBefore(){
        System.err.println(" --- 坐地铁上班 --- ");
    }

    public void byUnderGroundAfter(){
        System.err.println(" --- 坐地铁回家 --- ");
    }

    public void sleep(){
        System.err.println(" --- 睡觉 --- ");
    }

    public void gotoHospital(){
        System.err.println(" --- 去医院看病 --- ");
    }

}
