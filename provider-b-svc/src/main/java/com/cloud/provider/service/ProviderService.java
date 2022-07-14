package com.cloud.provider.service;

import com.cloud.common.dto.BaseResponse;
import com.cloud.common.dto.ResultCode;
import com.cloud.common.util.IdUtil;
import com.cloud.provider.dto.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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

    /**
     * 当前服务端口
     */
    @Value("${server.port}")
    private String port;

    public String testHello() {
        return "生产者B，你好！";
    }

    public BaseResponse<Product> getGoods() {

        Product product = new Product();
        product.setId(IdUtil.getUUID());
        product.setName("七彩虹 RTX 3060ti");
        product.setPrice(3499.00);


//        throw new RuntimeException("报错");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new BaseResponse<>(product, ResultCode.SUCCESS, "从商家：" + port + "，获取商品");
    }

}
