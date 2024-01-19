package cn.edu.hit.innerclass;

public class InnerClassDemo {

    public static void main(String[] args) {
        /*内部类：定义在一个类里面的类*/
        /*创建格式：外部类.内部类 对象名 = new 外部类对象().new 内部类对象()
         *       - 这样子是为了防止多个类中的内部类重名的情况*/


        Outer.Inner oi = new Outer().new Inner();

        /*成员访问细节：
         * 1.内部类中，访问外部类成员：直接访问，包括私有
         * 2.外部类中，访问内部类成员：需要创建对象访问，*/
        oi.show();

        /*内部类作用：
         * 写一个大的javabean类，某个属性也可以抽象为一个类，此时可以用内部类*/
        /*内部类分为：成员内部类，局部内部类，静态内部类，匿名内部类*/

    }

}

class Outer {
    int num = 0;

    /*静态内部类*/
    static class SInner {
        public static void show1() {
            /*静态内部访问外部成员，只能访问外部静态成员，否则只能先创建外部类对象然后使用外部类普通成员*/

            System.out.println("show...");
            Outer o = new Outer();
            System.out.println(o.num);
        }

        public void show() {
            /*一般用static，这样可以不断的用类名直接调用方法*/
            System.out.println("show...");
        }
    }

    /*成员内部类*/
    class Inner {
        int num = 10;

        public void show() {
            /*外部类和内部类变量或方法重名：
             * 不能使用super，使用外部类.this.变量进行使用*/
            System.out.println("show...");
            System.out.println(Outer.this.num);
        }
    }
}

class A {
    /*局部内部类可以在方法，代码块，构造器等定义
     * 注意局部内部类随着方法，代码块，构造器的执行而存在，只能在对应的内容里创建和执行，比较鸡肋*/
    public void show() {
        class B {
            public void method() {
                System.out.println("method");
            }
        }
    }
}