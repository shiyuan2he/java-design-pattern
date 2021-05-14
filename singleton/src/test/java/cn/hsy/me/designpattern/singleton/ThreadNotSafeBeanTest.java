//package cn.hsy.me.designpattern.singleton;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * @author heshiyuan
// * @description <p></p>
// * @path java-design-pattern/com.hsy.designpattern.singleton
// * @date 2018/1/23 17:44
// * @github http://github.com/shiyuan2he
// * @email shiyuan4work@sina.com
// * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
// * @price ¥5    微信：hewei1109
// */
//public class ThreadNotSafeBeanTest extends ConcurrentMock {
//    private static final Logger _logger = LoggerFactory.getLogger(ThreadNotSafeBeanTest.class) ;
//    @Test
//    public void getInstance() throws Exception {
//        super.execute();
//    }
//    public int getConcurrentNo(){
//        return 50;
//    }
//
//    public void doMethod(){
//        _logger.info("{}",ThreadNotSafeBean.getInstance() == ThreadNotSafeBean.getInstance());
//    }
//
//    public int getSleepTime(){
//        return 0;
//    }
//}