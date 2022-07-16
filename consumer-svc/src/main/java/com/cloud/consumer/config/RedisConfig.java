package com.cloud.consumer.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Redis缓存配置
 */
@Configuration
public class RedisConfig {
    @Primary
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {

        RedisSerializer<Object> valueRedisSerializer = new GenericFastJsonRedisSerializer();
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        RedisTemplate<String, Object> template = new RedisTemplate();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(valueRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);
        template.setHashValueSerializer(valueRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}

