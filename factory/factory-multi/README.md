## 多工厂工厂模式

当我们做一个比较复杂的项目时，经常会遇到初始化一个对象很耗费精力的情况，所有的产品类都放到一个工厂方法中进行初始化会使代码结构不清晰。
考虑到需要结构清晰，我们就为每个产品定义一个创造者，然后由调用者自己去选择与哪个工厂方法关联。

### uml类图

![image](http://note.youdao.com/favicon.ico)

### 实现

1. 抽象工厂类AbstractMultiMachineFactory.java

```java
public abstract class AbstractMultiMachineFactory {
   abstract public Machine createMaching();
}
```

2. 具体工厂类

自行车工厂

BikeFactory.java
```java
public class BikeFactory extends AbstractMultiMachineFactory{
    @Override
    public Machine createMaching() {
        return new Bike();
    }
}
```

轿车工厂

CarFactory.java
```java
public class CarFactory extends AbstractMultiMachineFactory{
    @Override
    public Machine createMaching() {
        return new Car();
    }
}
```

卡车工厂

TruckFactory.java
```java
public class TruckFactory extends AbstractMultiMachineFactory{
    @Override
    public Machine createMaching() {
        return new Truck();
    }
}
```

产品类不动

## 客户测试
```java
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
```

## 多方法工厂模式

相较于上一篇，稍作改动即可。
MultiMachineFactory.java
```java
/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method
 * @date 2018/1/30 16:01
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class MultiMachineFactory {
    /**
     * 造自行车
     */
    public static Machine createBike() {
        return new Bike();
    }

    /**
     * 造小汽车
     */
    public static Machine createCar() {
        return new Car();
    }

    /**
     * 造卡车
     */
    public static Machine createTruck() {
        return new Truck();
    }
}
```

测试类

```java
public class MultiMethodClientTest {
    @Test
    public void createMachine(){
        // 打包给客户的集装箱
        List<Machine> list = new ArrayList<>() ;

        /**
         * 1.客户下订单，开始造车（2辆汽车，2两卡车，2两自行车）
         */
        // 造汽车生产线
        for(int i=0;i<2;i++){
            list.add(MultiMachineFactory.createCar());
        }
        // 造卡车生产线
        for(int i=0;i<2;i++){
            list.add(MultiMachineFactory.createTruck());
        }
        // 造自行车生产线
        for(int i=0;i<2;i++){
            list.add(MultiMachineFactory.createBike());
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
```