package com.ikang.feign;

import com.ikang.entity.User;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author xuyang
 */
@Component
public class UserFeignFallBack implements UserFeign {

    @Override
    public User findById(Long id) {
        return new User(id, "default username", "default name", 0, BigDecimal.ZERO);
    }
}
