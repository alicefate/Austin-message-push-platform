package com.javaykx.austin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * @author ykx
 * @date 2023/04/19
 */

@RestController
public class TestController {
    @RequestMapping("/test")
    private String test() {
        return "success YKX";
    }
}
