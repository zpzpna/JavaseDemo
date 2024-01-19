package com.heihei.operator;

public class OperatorTest {
    public static void main(String[] args) {
        short s = 1;
        s += 1;
        System.out.println(s);
        // 注意！+=这种运算符，内部自动嵌入了强制转换
        s = (short) (s + 1);
        System.out.println(s);
    }

}
