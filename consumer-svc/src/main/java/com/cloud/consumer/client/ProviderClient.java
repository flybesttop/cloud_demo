package com.cloud.consumer.client;

import com.cloud.common.dto.BaseResponse;
import com.cloud.consumer.client.fallback.ProviderFallbackFactory;
import com.cloud.consumer.dto.Product;
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
    BaseResponse<Product> getGoods();


}
