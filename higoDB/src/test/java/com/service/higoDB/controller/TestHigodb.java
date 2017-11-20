package com.service.higoDB.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHigodb {

    HigodbImpl higodbImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        higodbImpl = BeanUtils.getBean("higodbImpl");
    }



    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: higodbImpl.helloworld(String name)
        String returnValue = higodbImpl.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}