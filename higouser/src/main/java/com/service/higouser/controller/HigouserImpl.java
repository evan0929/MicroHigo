package com.service.higouser.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-30T12:55:40.652Z")

@RestSchema(schemaId = "higouser")
@RequestMapping(path = "/higouser", produces = MediaType.APPLICATION_JSON)
public class HigouserImpl {

    @Autowired
    private HigouserDelegate userHigouserDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHigouserDelegate.helloworld(name);
    }

}
