package com.hsy.java.design.pattern.multiple;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Data
@AllArgsConstructor
public class Emperor {
    private String name ;// 皇帝的名字
    private static final int maxNumOfEmperor = 2;
    private static List<Emperor> emperorList = new ArrayList<>(maxNumOfEmperor);
    static {
        emperorList.add(new Emperor("吊炸天大帝初代"));
        emperorList.add(new Emperor("吊炸天大帝二代"));
    }
    public static Emperor getInstance(){
        Random random = new Random();
        return emperorList.get(random.nextInt(maxNumOfEmperor));
    }

    public static Emperor getInstance(int index){
        return emperorList.get(index);
    }
}
