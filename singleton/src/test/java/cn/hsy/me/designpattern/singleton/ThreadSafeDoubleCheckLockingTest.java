package cn.hsy.me.designpattern.singleton;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 2018/1/23 17:38
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadSafeDoubleCheckLockingTest {
    private static final Logger _logger = LoggerFactory.getLogger(ThreadSafeDoubleCheckLockingTest.class) ;
    @Test
    public void getInstance() throws Exception {
       /* for (int i = 0; i < 10000; i++) {
            FixedThreadPool.getInstince().getFixedThreadPool().submit(new Thread(() ->
                _logger.info("{}",ThreadSafeDoubleCheckLocking.getInstance() == ThreadSafeDoubleCheckLocking.getInstance())
            ));
        }*/
    }

}