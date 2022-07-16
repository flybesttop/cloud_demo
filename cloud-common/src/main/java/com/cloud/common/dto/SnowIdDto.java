package com.cloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author sherry
 * @description
 * @date Create in 2020/3/4
 * @modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SnowIdDto implements Serializable, Comparable<SnowIdDto> {

    /**
     * 注册时的时间戳
     */
    private Long timestamp;

    /**
     * 数据中心节点  0~31
     */
    private Integer dataCenterId;
    /**
     * 工作节点 0~31
     */
    private Integer workerId;

    @Override
    public int compareTo(SnowIdDto o) {
        long ex = this.timestamp - o.getTimestamp();
        return ex > 0 ? 1 : -1;
    }
}
