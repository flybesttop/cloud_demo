package com.cloud.provider.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 公共配置
 *
 * @author mtx
 * @date 2022-07-11
 */
@Configuration
public class CommonConfig {

    @Bean
    @LoadBalanced // 给RestTemplate配置负载均衡
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5 * 1000);
        requestFactory.setReadTimeout(5 * 1000);
        return new RestTemplate(requestFactory);
    }

}
