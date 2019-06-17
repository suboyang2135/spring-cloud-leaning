package com.ikang.controller;

import com.ikang.dao.UserRepository;
import com.ikang.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author xuyang
 */
@Slf4j
@RestController
@RequestMapping("/users")
@Api(value = "user相关接口")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "通过用户编号id获取用户信息", notes = "用户id", tags = "1.0")
    public User findById(@PathVariable @ApiParam(name = "id", value = "用户编号id", defaultValue = "1") Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }
}
