package com.xdz.service.impl;

import com.xdz.service.AspectForXmlService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service("aspectForXmlServiceImpl")
public class AspectForXmlServiceImpl {

    public void getUp(){
        System.err.println(" --- �� --- ");
    }

    public void washfaceAndTeeth(){
        System.err.println(" --- ϴ��ˢ�� --- ");
    }

    public void byUnderGroundBefore(){
        System.err.println(" --- �������ϰ� --- ");
    }

    public void byUnderGroundAfter(){
        System.err.println(" --- �������ؼ� --- ");
    }

    public void sleep(){
        System.err.println(" --- ˯�� --- ");
    }

    public void gotoHospital(){
        System.err.println(" --- ȥҽԺ���� --- ");
    }

}
