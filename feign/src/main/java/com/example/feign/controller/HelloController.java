package com.example.feign.controller;

import com.example.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cecil on 17-10-10.
 */
@RestController
public class HelloController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return hiService.sayHiFromClient(name);
    }

}
