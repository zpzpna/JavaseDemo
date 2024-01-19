package com.heihei.method;

// 学会想象方法去和栈区执行
// 方法区：方法没有被调用时位置，也就是字节码文件class加载进方法去
// 栈内存：方法被调用时放入
// 分屏操作：右键，split and move right

// 重载：同一个类中参数不同，方法名相同的多个方法
// 参数不同指的是：参数个数不同，类型不同，类型顺序不同
// 返回值与重载无关
public class MethodTest {
    // 学习写方法：只需要像main一样，在类里面造方法函数就可以，然后在主方法里调用
    // 方法之间平级！！不能把其他方法放进主方法里
    public static void main(String[] args) {

        int a = getMax(1, 2);
        double b = getMax(1, 1.1, 0.1f);
        System.out.println(a);
        System.out.println(b);
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static double getMax(int a, double b, float c) {
        // 重载,同名不同参
        double maxValue = a > b ? a : b;
        maxValue = maxValue > c ? maxValue : c;
        return maxValue;
    }

}
