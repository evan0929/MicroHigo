package com.service.higoService.controller;

import io.servicecomb.provider.rest.common.RestSchema;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-20T11:23:11.089Z")
@RestSchema(schemaId = "higoService")
@RequestMapping(path = "/higoService", produces = MediaType.APPLICATION_JSON)
public class GetDiscount {
    
    private static RestTemplate restTemplate = RestTemplateBuilder.create();

    @RequestMapping(value = "/getDiscount", produces = { "application/json" }, method = RequestMethod.GET)
    public String getDiscount(@RequestParam(value = "location", required = true) String location) {
        String discountResult = restTemplate.getForObject("cse://higoDB/higodb/getDiscount?location="+location, String.class);
        return discountResult;
    }
}
