## 单例模式

### why

如果创造出多个实例，就会导致许多问题，比如占用过多资源，不一致的结果等。只有使用单例模式，保证了整个应用中某个实例有且仅有一个。

### 定义

Ensure a class has only one instance, and provide a global point of access to it.（确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。）

### 实现

#### 饿汉模式（线程安全）

HungryManImplementation.java

代码：

```java
/**
 * @author heshiyuan
 * @description <p>恶汉模式</p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:33 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class HungryManImplementation {
    // 1.将构造方法私有化，不允许外界直接创建对象
    private HungryManImplementation(){}

    /**
     * 创建类的唯一实例，使用 private static final 来修饰
     * 思考点：
     *  1.这个实例什么时候加载？
     *      答：java虚拟机类加载的时候自动实例化static修饰的变量
     *  2.为什么使用private
     *      答：不允许通过 类名.instance 方式再次实例化
     */
    private static final HungryManImplementation instance = new HungryManImplementation();

    /**
     * 对外提供一个公共的用于获取实例的方法（public 修饰）
     * @return 唯一实例
     */
    public static HungryManImplementation getInstance(){
        return instance ;
    }
}
```

#### 通用懒汉模式（线程不安全）

ThreadNotSafeBean.java
```java
package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p>线程安全的懒汉单例模式</p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 2:56 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadNotSafeBean {
    // 类加载时候不实例化
    private static ThreadNotSafeBean instance ;

    // 第一次用到的时候实例化，懒加载，线程不安全
    public static ThreadNotSafeBean getInstance(){
        /**
         * 以下代码线程不安全，多线程情况下可能会new出来多个实例
         */
        if(null == instance){
            instance = new ThreadNotSafeBean() ;
        }
        return instance ;
    }
}
```

#### 懒汉模式（线程安全）

ThreadSafeLazyLoaded.java

```java
/**
 * @author heshiyuan
 * @description <p>线程安全的懒汉单例模式</p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 2:56 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadSafeLazyLoaded {
    // 类加载时候不实例化
    private static ThreadSafeLazyLoaded instance ;
    // 私有化构造器，防止运行期new新的实例
    private ThreadSafeLazyLoaded(){
        //防止反射调用
        if(null!=instance){
            throw new IllegalStateException("Already initialized!") ;
        }
    }
    // 第一次用到的时候实例化，懒加载，线程安全
    public static synchronized ThreadSafeLazyLoaded getInstance(){
        if(null == instance){
            instance = new ThreadSafeLazyLoaded() ;
        }
        return instance ;
    }
}
```

#### 懒汉模式变种

ThreadSafeDoubleCheckLocking.java

```java
/**
 * @author heshiyuan
 * @description <p>线程安全双重锁</p>
 * @path java-design-pattern/com.hsy.designpattern.singletom
 * @date 11/09/2017 8:47 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadSafeDoubleCheckLocking {
    /**
     *  类加载不实例化，并且使用volatile修饰
     *  volatile作用：当volatile修饰的变量在某一个线程发生改变时，会在所有用的此变量的线程刷新成新的值
     */
    private static volatile ThreadSafeDoubleCheckLocking instance ;

    // 私有化构造器
    private ThreadSafeDoubleCheckLocking(){
        // 防止使用反射实例化ThreadSafeDoubleCheckLocking实例
        if(null != instance){
            throw new IllegalStateException("Already initialized!") ;
        }
    }
    /**
     * @description <p>给类添加同步锁实现单例模式</p>
     * @return 唯一单例对象
     * @author heshiyuan
     * @date 11/09/2017 9:53 AM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    public static ThreadSafeDoubleCheckLocking getInstance(){
        ThreadSafeDoubleCheckLocking result = instance ;
        if(null == result){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instance ;
                if(null == result){
                    instance = result = new ThreadSafeDoubleCheckLocking() ;
                }
            }
        }
        return result ;
    }
}
```
#### 静态内部类模式

StaticInnerClassImplementation.java

```java
/**
 * @author heshiyuan
 * @description <p>静态内部类实现单例模式</p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:13 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public final class StaticInnerClassImplementation {
    // 私有化构造器
    private StaticInnerClassImplementation(){}

    public static StaticInnerClassImplementation getInstance(){return HelpHolder.INSTANCE;}

    // 静态内部类对外部类进行实例化
    private static class HelpHolder{
        private static final StaticInnerClassImplementation INSTANCE  = new StaticInnerClassImplementation() ;
    }
}
```
