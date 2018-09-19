package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-19T08:30:30.627Z")

@RestSchema(schemaId = "projectuvcw")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class ProjectuvcwImpl {

    @Autowired
    private ProjectuvcwDelegate userProjectuvcwDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectuvcwDelegate.helloworld(name);
    }

}
