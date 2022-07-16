package com.cloud.provider.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mtx
 * @since 2022-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("product")
public class ProductDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String productName;

    private Long productPrice;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    public static final String ID = "id";

    public static final String PRODUCT_NAME = "product_name";

    public static final String PRODUCT_PRICE = "product_price";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

}
