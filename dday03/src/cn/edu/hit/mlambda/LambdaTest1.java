package cn.edu.hit.mlambda;

import java.util.Random;

/*匿名内部类和lambda区别：
 * 实现方式：
 * 匿名内部类编译后会产生class文件，而lambda不会，
 *
 * 使用限制：
 * 匿名内部类：可以用在类和接口中
 * lambda：只能用在函数式编程接口*/

interface InterT1 {
    /*无参数抽象方法*/
    static void method() {
        System.out.println("nothing");
    }

    void show();
}

interface InterT2 {
    /*单个参数抽象方法*/
    default void method() {
        System.out.println("nothiong");

    }

    void printmsg(String msg);
}

interface InterT3 {
    /*有返回值的抽象方法*/
    int produceRandomNum();

}

interface InterT4 {
    /*多参数方法*/
    int subtract(int a, int b);
}

public class LambdaTest1 {
    /*流程：
     * 接口中有一个抽象类
     * 一个方法中有个参数是这个接口类型对象，直接调用对象方法并传入实际参数
     * 主方法lambda实现
     * */
    public static void main(String[] args) {
        test(new InterT1() {
            @Override
            public void show() {
                System.out.println("show");
            }
        });
        test(() -> System.out.println("最省略的第一季"));
        /*注意：没有形参必须写括号，能不写括号的只有1参数时，指向的代码体只有一行，可以删去{}，此时必须同时删去;*/


        test2(new InterT2() {
            @Override
            public void printmsg(String msg) {
                System.out.println("lambda打印" + msg);
            }
        });

        test2(msg -> System.out.println("最省略的第二季-" + msg));

        test3(() -> new Random().nextInt(100) + 1);
        test4((a, b) -> a - b);
    }

    public static void test(InterT1 inter) {
        inter.show();
    }

    public static void test2(InterT2 inter) {
        inter.printmsg("HIT");
    }

    public static void test3(InterT3 inter) {
        int a = inter.produceRandomNum();
        System.out.println("最随机的第三季:" + a);
    }

    public static void test4(InterT4 inter) {
        int x = inter.subtract(3, 1);
        System.out.println("最随机的第四季:" + x);
    }
}
