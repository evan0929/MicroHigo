package com.service.higoDB.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-20T11:23:11.089Z")

@RestSchema(schemaId = "higodb")
@RequestMapping(path = "/higoDB", produces = MediaType.APPLICATION_JSON)
public class HigodbImpl {

    @Autowired
    private HigodbDelegate userHigodbDelegate;
    @Autowired
    private DiscountImlp discountImpl; 


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHigodbDelegate.helloworld(name);
    }

    @RequestMapping(value = "/getDiscount",
            produces = { "application/json" }, 
            method = RequestMethod.GET)
        public String getDiscount( @RequestParam(value = "location", required = true) String location){

            return discountImpl.getDiscount(location);
        }
}
