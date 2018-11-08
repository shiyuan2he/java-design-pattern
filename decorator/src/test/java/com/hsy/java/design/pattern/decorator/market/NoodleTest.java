package com.hsy.java.design.pattern.decorator.market;

import com.hsy.java.design.pattern.decorator.market.decorator.DouPiErDecorator;
import com.hsy.java.design.pattern.decorator.market.decorator.EggDecorator;
import com.hsy.java.design.pattern.decorator.market.decorator.SausageDecorator;
import com.hsy.java.design.pattern.decorator.market.veggie.Pappardelle;
import com.hsy.java.design.pattern.decorator.market.veggie.Vermicelli;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
@Slf4j
public class NoodleTest {
    @Test
    public void eat(){
        // 来一碗宽面  + 一张豆皮儿 + 一个卤蛋
        Noodle kuanMian = new Pappardelle();
        kuanMian = new DouPiErDecorator(kuanMian);
        kuanMian = new EggDecorator(kuanMian);
        // 来一碗细面   一根香肠 + 一个卤蛋
        Noodle xiMian = new Vermicelli();
        xiMian = new SausageDecorator(xiMian);
        xiMian = new EggDecorator(xiMian);


        log.info("结账---------");
        log.info("{} 共{}",kuanMian.getDescription(), kuanMian.cost());
        log.info("{} 共{}",xiMian.getDescription(), xiMian.cost());
    }
}