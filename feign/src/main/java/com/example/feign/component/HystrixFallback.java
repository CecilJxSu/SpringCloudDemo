package com.example.feign.component;

import com.example.feign.service.HiService;
import org.springframework.stereotype.Component;

/**
 * Created by cecil on 17-10-10.
 */
@Component
public class HystrixFallback implements HiService {

    @Override
    public String sayHiFromClient(String name) {
        return "sorry, " + name;
    }
}
