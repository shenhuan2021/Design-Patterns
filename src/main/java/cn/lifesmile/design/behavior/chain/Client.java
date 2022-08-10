package cn.lifesmile.design.behavior.chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        List<Women> list = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            list.add(new Women(random.nextInt(3)));
        }
        for (Women women : list) {
            father.handlerMessage(women);
        }
    }
}
