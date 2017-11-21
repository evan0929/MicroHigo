package com.service.higoService.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-21T05:02:19.158Z")

@RestSchema(schemaId = "higoservice")
@RequestMapping(path = "/higoService", produces = MediaType.APPLICATION_JSON)
public class HigoserviceImpl {

    @Autowired
    private HigoserviceDelegate userHigoserviceDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHigoserviceDelegate.helloworld(name);
    }

}
