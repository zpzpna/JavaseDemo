package cn.edu.hit.ifwhile;

import java.util.Random;

public class randomDemo {
    // 给一个num，random生成的是0-num-1，通过+-改变初始0！
    public static void main(String[] args) {
        randomTest();
    }

    public static void randomTest() {
        Random r = new Random();
        // 20-60
        System.out.println(r.nextInt(41) + 20);
    }
}
