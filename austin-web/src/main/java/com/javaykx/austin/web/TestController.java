package com.javaykx.austin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ykx
 * @date 2023/04/19
 */

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/test")
    private String test() {
        System.out.println("sout: good job");
        log.info("log: good work");
        return "nice try";
    }
}
