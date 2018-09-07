package com.hsy.java.design.pattern.factory.multi;
import com.hsy.java.design.pattern.factory.multi.factory.BikeFactory;
import com.hsy.java.design.pattern.factory.multi.factory.CarFactory;
import com.hsy.java.design.pattern.factory.multi.factory.TruckFactory;
import com.hsy.java.design.pattern.factory.multi.product.Bike;
import com.hsy.java.design.pattern.factory.multi.product.Car;
import com.hsy.java.design.pattern.factory.multi.product.Machine;
import com.hsy.java.design.pattern.factory.multi.product.Truck;
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
@SuppressWarnings("Duplicates")
public class ClientTest {
    @Test
    public void createMachine(){
        // 打包给客户的集装箱
        List<Machine> list = new ArrayList<>() ;

        /**
         * 1.客户下订单，开始造车（2辆汽车，2两卡车，2两自行车）
         */
        // 造汽车生产线
        CarFactory carFactory = new CarFactory() ;
        for(int i=0;i<2;i++){
            list.add(carFactory.createMaching());
        }
        // 造卡车生产线
        TruckFactory truckFactory = new TruckFactory() ;
        for(int i=0;i<2;i++){
            list.add(truckFactory.createMaching());
        }
        // 造自行车生产线
        BikeFactory bikeFactory = new BikeFactory() ;
        for(int i=0;i<2;i++){
            list.add(bikeFactory.createMaching());
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