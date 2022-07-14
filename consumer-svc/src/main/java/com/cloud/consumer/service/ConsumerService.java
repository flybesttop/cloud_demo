package com.cloud.consumer.service;

import com.cloud.common.dto.BaseResponse;
import com.cloud.consumer.client.ProviderClient;
import com.cloud.consumer.dto.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者服务
 *
 * @author mtx
 * @date 2022-07-11
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final ProviderClient providerClient;

    private final RestTemplate restTemplate;

    public String testHello() {
        return "消费者，你好！";
    }

    /**
     * 购买商品
     *
     * @return
     */
    public BaseResponse<Product> payGoods() {

//        String payUrl = "http://provider/provider/getGoods";
//        return restTemplate.getForObject(payUrl, String.class);

        return providerClient.getGoods();

    }

}
