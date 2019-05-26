package com.ikang.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuyang
 */
@Configuration
public class BalanceConfig {

    @Bean
    public IRule balanceRole() {
        return new RandomRule();
    }
}
