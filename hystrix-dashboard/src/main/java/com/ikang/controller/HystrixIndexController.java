package com.ikang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuyang
 */
@Controller
public class HystrixIndexController {

    @GetMapping("")
    public String index() {
        return "forward:/hystrix";
    }
}
