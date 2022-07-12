package com.cloud.provider.controller;

import com.cloud.provider.service.ProviderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生产者服务
 * @author mtx
 * @date 2022-07-11
 */
@Slf4j
@RestController
@RequestMapping("/provider")
@RequiredArgsConstructor
public class ProviderController {

    private final ProviderService providerService;

    @GetMapping("/testHello")
    public String testHello(){
        return providerService.testHello();
    }

    @GetMapping("/getGoods")
    public String getGoods(){
        return providerService.getGoods();
    }

}
