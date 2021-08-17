package com.healthme.controller;

import com.healthme.service.UserService;
import com.healthme.util.RedisUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseJunit4Test extends AbstractJUnit4SpringContextTests {
    private static Logger logger = LoggerFactory.getLogger(BaseJunit4Test.class);
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        try {
            RedisUtil.setString("test-f", "fffffffffffffffffffffffffffffffffff");

            logger.info("----------------------------------------------------" + userService.TestLock());

        }catch (Exception e){
            logger.error("", e);
            System.out.println("----------------------------------------------------" + e.getMessage());
        }
    }

}
