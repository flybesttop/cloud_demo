package com.cloud.middleman.controller;

import com.cloud.middleman.service.MiddlemanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 中间商服务
 * @author mtx
 * @date 2022-07-11
 */
@Slf4j
@RestController
@RequestMapping("/middleman")
@RequiredArgsConstructor
public class MiddlemanController {

    private final MiddlemanService middlemanService;

    @GetMapping("/testHello")
    public String testHello(){
        return middlemanService.testHello();
    }

}
