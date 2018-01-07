package com.hsy.designpattern.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 9:04 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public abstract class SingletonTest<S> {
    private static final Logger _logger = LoggerFactory.getLogger(App.class);
    private Supplier<S> singletonInstanceMethod ;
    public SingletonTest(final Supplier<S> singletonInstanceMethod){
        this.singletonInstanceMethod = singletonInstanceMethod ;
    }
    /**
     * @description <p>单线程（non-concurrent）测试单例</p>
     * @param
     * @author heshiyuan
     * @date 11/09/2017 9:07 AM 
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    @Test
    public void testMultipleCallsReturnTheSameObjectInSameThread(){
        /**
         * @description <p>单线程创建多实例</p>
         * @author heshiyuan
         * @date 11/09/2017 9:39 AM
         */
        S instance1 = this.singletonInstanceMethod.get() ;
        S instance2 = this.singletonInstanceMethod.get() ;
        S instance3 = this.singletonInstanceMethod.get() ;
        // 校验是否相等
        Assert.assertSame(instance1,instance2) ;
        Assert.assertSame(instance1,instance3) ;
        Assert.assertSame(instance2,instance3) ;
        _logger.info(instance1.toString());
        _logger.info(instance2.toString());
        _logger.info(instance3.toString());
    }
    /**
     * @description <p>高并发环境测试单例</p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan
     * @date 11/09/2017 9:42 AM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    @Test(timeout = 10 * 1000)
    public void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws InterruptedException, ExecutionException {
        // 创建10000个线程任务
        final List<Callable<S>> tasks = new ArrayList<>() ;
        for(int i=0;i<10000;i++){
            tasks.add(this.singletonInstanceMethod::get) ;
        }
        // 创建8个线程的线程池
        final ExecutorService executorService = Executors.newFixedThreadPool(8) ;
        final List<Future<S>> results = executorService.invokeAll(tasks) ;
        final S expectedInstance = this.singletonInstanceMethod.get();
        for (Future<S> res : results) {
            final S instance = res.get();
            _logger.info(instance.toString());
            Assert.assertNotNull(instance);
            Assert.assertSame(expectedInstance, instance);
        }
        // tidy up the executor
        executorService.shutdown();
    }
}
