package com.cloud.consumer.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.cloud.common.dto.SnowIdDto;
import com.cloud.common.util.CloudUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author mtx
 * @description
 * @date Create in 2019/12/6
 * @modified By:
 */
@Slf4j
@EnableTransactionManagement
@Configuration
@MapperScan(basePackages = "com.cloud.consumer.dao.mapper")
public class MyBatisPlusConfig {

    @Value("${spring.application.name}")
    private String appName;
    private final RedisTemplate redisTemplate;

    public MyBatisPlusConfig(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 乐观锁
     *
     * @return
     */
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor() {
        return new OptimisticLockerInnerInterceptor();
    }


    /**
     * 分页插件
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    /**
     * 详见：https://blog.csdn.net/zyw562123314/article/details/108903456?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.baidujs&dist_request_id=&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.baidujs
     *
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> configuration.setUseDeprecatedExecutor(false);
    }


    @Bean
    public IdentifierGenerator idGenerator() {
        SnowIdDto snowIdDto = CloudUtil.calculateDataIdAndWorkId(redisTemplate, appName);
        log.info("初始化id生成器:dataCenterId:{},workerId:{}", snowIdDto.getDataCenterId(), snowIdDto.getWorkerId());
        return new DefaultIdentifierGenerator(snowIdDto.getWorkerId(), snowIdDto.getDataCenterId());
    }

}