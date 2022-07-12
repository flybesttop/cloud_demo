package com.cloud.consumer.client.fallback;

import com.cloud.consumer.client.ProviderClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 生产者服务 熔断
 * @author mtx
 * @date 2022-07-12
 */
@Component
public class ProviderFallbackFactory implements FallbackFactory<ProviderClient> {
    @Override
    public ProviderClient create(Throwable throwable) {
        return new ProviderClient() {
            @Override
            public String getGoods() {
                return "生产者摸鱼去了，请稍等后重试！";
            }
        };
    }
}
