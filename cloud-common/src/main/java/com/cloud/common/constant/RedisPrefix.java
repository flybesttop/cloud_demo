package com.cloud.common.constant;

/**
 * Redis缓存key的前缀
 */
public interface RedisPrefix {
    String TOKEN = "TOKEN:";
    String SMS_UPCODE = "SMS:UPCODE:";
    String SNOW = "SNOW:";
    String LOCK_PUSH_LOG = "LOCK:PUSH:LOG:";
    String VALIDATE_CODE = "VALIDATE_CODE:";
}
