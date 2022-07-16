package com.cloud.consumer.dao.impl;

import com.cloud.consumer.model.UserDO;
import com.cloud.consumer.dao.mapper.UserMapper;
import com.cloud.consumer.dao.UserDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mtx
 * @since 2022-07-16
 */
@Service
public class UserDaoImpl extends ServiceImpl<UserMapper, UserDO> implements UserDao {

}
