package com.hb.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    //@Value("${server.port}")
    private String port = "666";

    //@Value("${foo}")
    private String foo = "999";

    //有问题@Value("${server.port}")  @Value("${foo}"）

    @GetMapping("/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}