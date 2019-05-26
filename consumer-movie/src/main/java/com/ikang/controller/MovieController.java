package com.ikang.controller;

import com.ikang.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @author xuyang
 */
@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    @HystrixCommand(fallbackMethod = "findForUserFallBack")
    public User findForUser(@PathVariable Long id) {
        return restTemplate.getForObject("http://provider-user/users/{id}", User.class, id);
    }

    public User findForUserFallBack(Long id, Throwable throwable) {
        log.error("进入fall back方法，失败原因", throwable);
        return new User(id, "default username", "default name", 0, BigDecimal.ZERO);
    }
}
