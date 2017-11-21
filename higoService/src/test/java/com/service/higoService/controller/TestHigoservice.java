package com.service.higoService.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHigoservice {

    HigoserviceImpl higoserviceImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        higoserviceImpl = BeanUtils.getBean("higoserviceImpl");
    }



    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: higoserviceImpl.helloworld(String name)
        String returnValue = higoserviceImpl.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}