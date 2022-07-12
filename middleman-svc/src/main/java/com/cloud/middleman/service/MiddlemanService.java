package com.cloud.middleman.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 中间商服务
 *
 * @author mtx
 * @date 2022-07-11
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class MiddlemanService {

    public String testHello() {
        return "中间商，你好！";
    }

}
