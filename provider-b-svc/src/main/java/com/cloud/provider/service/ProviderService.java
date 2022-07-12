package com.cloud.provider.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 生产者服务
 *
 * @author mtx
 * @date 2022-07-11
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ProviderService {

    public String testHello() {
        return "生产者B，你好！";
    }

    public String getGoods() {
        return "你从生产者B中获取到了一件商品";
    }
}
