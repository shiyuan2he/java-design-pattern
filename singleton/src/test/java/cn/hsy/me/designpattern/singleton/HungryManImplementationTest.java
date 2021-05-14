package cn.hsy.me.designpattern.singleton;

import cn.hsy.me.hetool.log.Log;
import cn.hsy.me.hetool.log.LogFactory;
import cn.hutool.core.lang.Assert;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 2018/1/23 15:18
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class HungryManImplementationTest{
    @Test
    public void newInstance(){
        /**
         *  private HungryManImplementation()  唯一构造器私有化，导致无法new instance
         *  下面代码编译不通过
         */
//        HungryManImplementation instance = new HungryManImplementation();
    }

    @Test
    public void cloneInstance(){
        /**
         * 由于克隆需要本类实现Cloneable，重写clone方法，此处无法利用clone
         * 实现instance复制
         */
    }

    /**
     * 启动一万个线程,每个线程获取两次恶汉实例，判断是否相等
     * @throws Exception
     */
    @Test
    public void testHungryMan() throws Exception {
        for (int i = 0; i < 10000; i++) {
            new Runnable(){
                @Override
                public void run() {
                    Assert.isTrue(HungryManImplementation.getInstance() == HungryManImplementation.getInstance());
                }
            };
        }
    }
}