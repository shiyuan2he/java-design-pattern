package com.hsy.java.design.pattern.method.client;
import com.hsy.java.design.pattern.method.factory.Factory;
import com.hsy.java.design.pattern.method.factory.MachineFactory;
import com.hsy.java.design.pattern.method.product.Bike;
import com.hsy.java.design.pattern.method.product.Car;
import com.hsy.java.design.pattern.method.product.Machine;
import com.hsy.java.design.pattern.method.product.Truck;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method.client
 * @date 2018/1/30 16:13
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ClientTest {
    @Test
    public void createMachine(){
        // 打包给客户的集装箱
        List<Machine> list = new ArrayList<>() ;
        /**
         * 实例化一个造车工厂
         */
        Factory factory = new MachineFactory() ;
        /**
         * 1.客户下订单，开始造车（2辆汽车，2两卡车，2两自行车）
         */
        // 造汽车生产线
        for(int i=0;i<2;i++){
            list.add(factory.createMachine(Car.class));
        }
        // 造卡车生产线
        for(int i=0;i<2;i++){
            list.add(factory.createMachine(Truck.class));
        }
        // 造自行车生产线
        for(int i=0;i<2;i++){
            list.add(factory.createMachine(Bike.class));
        }

        //客户开始测验每辆车的性能
        list.forEach(ele -> {
            ele.start() ;
            ele.speed();
            ele.stop();
            if(ele instanceof Car){
                ((Car) ele).blow();
            }
            if(ele instanceof Truck){
                ((Truck) ele).blow();
            }
        });
    }

}