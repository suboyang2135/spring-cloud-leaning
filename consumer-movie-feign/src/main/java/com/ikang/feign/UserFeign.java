package com.ikang.feign;

import com.ikang.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xuyang
 */
@FeignClient(name = "provider-user",fallback = UserFeignFallBack.class)
public interface UserFeign {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);

}
