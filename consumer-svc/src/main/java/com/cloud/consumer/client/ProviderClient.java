package com.cloud.consumer.client;

import com.cloud.consumer.client.fallback.ProviderFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 生产者服务调用
 *
 * @author mtx
 * @date 2022-07-12
 */
@FeignClient(name = "provider", path = "/provider", fallbackFactory = ProviderFallbackFactory.class)
public interface ProviderClient {

    @GetMapping("/getGoods")
    String getGoods();


}
