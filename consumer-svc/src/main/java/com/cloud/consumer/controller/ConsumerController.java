package com.cloud.consumer.controller;

import com.cloud.common.dto.BaseResponse;
import com.cloud.consumer.dto.Product;
import com.cloud.consumer.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者
 *
 * @author mtx
 * @date 2022-07-11
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class ConsumerController {

    private final ConsumerService consumerService;

    @GetMapping("/testHello")
    public String testHello() {
        return consumerService.testHello();
    }

    @GetMapping("/payGoods")
    public BaseResponse<Product> payGoods() {
        return consumerService.payGoods();
    }

}
