package com.example.feign.service;

import com.example.feign.component.HystrixFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cecil on 17-10-10.
 */
@FeignClient(value = "service-hi", fallback = HystrixFallback.class)
public interface HiService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);

}
