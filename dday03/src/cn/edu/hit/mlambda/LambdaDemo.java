package cn.edu.hit.mlambda;

@FunctionalInterface
interface Inter {
    static void print() {
        System.out.println("这个是练习lambda的接口");
    }

    default void method() {
        System.out.println("我是普通方法");
    }

    void show();
}

public class LambdaDemo {
    /*lambda使用：
     * 只能对函数式编程接口使用，也就是有且仅有一个抽象方法的接口*/

    /*用法：在接口参数位置写()->{}左边小括号里写参数列表，右边大括号是被重写的方法的方法体代码*/
    public static void main(String[] args) {
        useInter(() -> {
            System.out.println("lambda真的太好用拉");
        });
    }

    public static void useInter(Inter inter) {
        inter.method();
        Inter.print();
        inter.show();
    }
}
