package com.service.higouser.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHigouser {

        HigouserDelegate higouserDelegate = new HigouserDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = higouserDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}