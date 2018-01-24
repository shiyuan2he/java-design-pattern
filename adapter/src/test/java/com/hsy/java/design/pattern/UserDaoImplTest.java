package com.hsy.java.design.pattern;

import com.hsy.java.design.pattern.impl.UserDaoImpl;
import com.hsy.java.design.pattern.impl.UserDaoImpl2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern
 * @date 2018/1/24 17:27
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class UserDaoImplTest {
    IUserDao userDao = null ;
    @Before
    public void setUp(){
        userDao = new UserDaoImpl() ;
    }
    @Test
    public void adapter() throws Exception {
        userDao.doAll();
        userDao.doOne();
    }

}