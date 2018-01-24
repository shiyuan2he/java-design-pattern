package com.hsy.java.design.pattern;

import com.hsy.java.design.pattern.impl.UserDaoImpl2;
import org.junit.Before;
import org.junit.Test;

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
public class UserDaoImpl2Test {
    IUserDao userDao = null ;
    @Before
    public void setUp(){
        userDao = new UserDaoImpl2() ;
    }
    @Test
    public void adapter() throws Exception {
        userDao.doAll();
        userDao.doOne();
    }

}