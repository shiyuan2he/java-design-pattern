package com.hsy.java.design.pattern.multiple;

public class Minister {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println(String.format("第%d个大臣正在参拜的皇帝是：%s", (i+1), emperor.getName()));
        }
    }
}
