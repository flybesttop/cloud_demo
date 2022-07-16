package com.cloud.consumer;

import com.cloud.consumer.dao.UserDao;
import com.cloud.consumer.model.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class ConsumerSvcApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

        UserDO userDO = new UserDO();
        userDO.setUsername("111");
        userDao.save(userDO);

    }

}
