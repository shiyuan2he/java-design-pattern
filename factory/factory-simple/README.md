## 简单工厂模式

工厂方法模式有很多扩展，而且与其他模式结合使用威力更大，以下是“简单工厂模式”。

### 场景

一个模块仅需要一个工厂类，没有必要把他产生出来，使用静态的方法就可以。

### 类图

![factory-method.pn](./src/main/resources/static/img/factory-method.pn)

### 实现

SimpleMachineFactory.java
```java
import com.hsy.java.design.pattern.factory.simple.product.Machine;

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
public class SimpleMachineFactory {
    public static <T extends Machine> T createMachine(Class<T> c) {
        Machine machine = null ;
        try {
            machine = (Machine) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) machine;
    }
}
```
### 特点
1. 它是一个具体的类，非接口或抽象类。
2. 有一个创建实例的静态方法。所以称静态工厂

### 缺点

1. 反射创建对象的性能不如new创建对象
2. 不同的产品需要不同的参数时不支持

