package cn.edu.hit.innerclass;

interface Inter {
    void method();
}

public class AnonClassDemo {
    /*注意：无论是匿名内部类，还是lambda，都是直接new抽象类/接口(){}来实现里面的抽象方法，之所以是匿名，因为通过使用抽象类或接口名从而省略了类名
     * 但是只能存在被实现的地方。*/

    /*对于接口参数或者抽象类参数，能传入的只有三个：匿名内部类实现，lambda实现，其他地方实现的类*/

    /*匿名内部类：本质上是一个特殊的局部内部类
     * 前提：需要存在一个接口或类
     * 格式：
     *       new 类名/接口名{
     *
     *       }
     *       new 类名(){} 代表实现这个类
     *       new 接口名(){} 代表实现这个接口
     *      结论：可以让代码更加简洁，在定义类的时候同时进行实例化
     *      应用场景：需要使用某个参数为接口的方法，此时这个接口的抽象方法少，用匿名内部类，抽象方法多，建个普通类*/
    public static void main(String[] args) {
        show(new Inter() {
            @Override
            public void method() {
                System.out.println("method");
            }
        });
    }

    public static void show(Inter inter) {
        inter.method();
    }

}