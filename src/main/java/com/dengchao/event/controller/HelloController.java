package com.dengchao.event.controller;

import com.dengchao.event.event.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : dengchao
 * @Create : 2018/10/10
 */
@RestController
public class HelloController {

    @Autowired
    private DemoPublisher demoPublisher;

    @GetMapping("/hello")
    public void sayHello(){
        demoPublisher.publish("hello");

    }
}
