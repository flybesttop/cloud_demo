package com.cloud.provider.dao.impl;

import com.cloud.provider.model.ProductDO;
import com.cloud.provider.dao.mapper.ProductMapper;
import com.cloud.provider.dao.ProductDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mtx
 * @since 2022-07-17
 */
@Service
public class ProductDaoImpl extends ServiceImpl<ProductMapper, ProductDO> implements ProductDao {

}
