package org.hsy.java.design.pattern.strategy;

import com.hsy.java.design.pattern.strategy.Context;
import com.hsy.java.design.pattern.strategy.OperationAdd;
import com.hsy.java.design.pattern.strategy.OperationMultiply;
import com.hsy.java.design.pattern.strategy.OperationSubtract;
import org.junit.Test;

/**
 * @author heshiyuan
 * @date 2021/5/14 14:40
 */
public class Client {

    @Test
    public void testStrategy(){
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(10, 5));
        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 5));
    }
}
