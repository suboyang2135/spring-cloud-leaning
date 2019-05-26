package com.ikang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyang
 */
@RestController
@RequestMapping("/check")
public class CheckController {

    @GetMapping("/alive")
    public String check() {
        return "I am alive !";
    }
}
