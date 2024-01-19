package cn.edu.hit.polymorphism;

interface Inter {
    void method();
}

/*创建对象左右两边类型不一致，所有对象都可以吗？必须是父类引用指向子类对象*/
/*为什么调用方法，同一种方法，不同表现形式？因为实际调用子类中方法*/
public class Polymorphism {
    public static void main(String[] args) {
        /*多态的前提：
         *           有继承/实现关系
         *           有方法重写
         *           有父类引用指向子类对象*/

        // 对象多态
        /*好处：方法形参设置为父类，可以传入任意子类对象*/
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        // 行为多态
        /*同一种方法，根据传入实际对象，产生不同的表现形式*/
        useAnimal(a2);

        /*多态成员访问特点：
         * 1.成员变量：编译看左边(父类)，运行看左边(父类)
         * 2.成员方法：编译看左边(父类)，运行看右边(子类)
         *
         *      一定先检查父类有没有，再运行子类方法
         *      原因：担心你调用的方法在父类中是一个抽象的方法*/
        /*好处：同一个行为具有不同表现能力*/
        Inter i = new InterImple();
        i.method(); //使用接口的行为多态

        /*多态创建对象，调用静态成员：
         *       静态成员，可以使用对象名调用，但这是假象，实际字节码中会把对象名改编为类名
         *       实际使用的是父类的逻辑*/


        /*多态的坏处：不能使用子类的特有成员，因为不能通过父类的编译检查*/

        /*多态转型技术：解决不能使用子类成员问题
         * */

        /*ClassCastException:引用类型转换时，如果实际类型和目标类型不一致，就会触发异常
         * 解决方法：先判断实际类型，用instanceof,判断左边对象名指向的类型是不是右边类型*/
        if (a1 instanceof Dog) {
            Dog dog1 = (Dog) a1;
            dog1.bark();
        }


    }

    public static void useAnimal(Animal animal) {
        System.out.println(animal.num); // 实际使用父类变量
        animal.eat();  // 实际使用子类方法
    }
}

abstract class Animal {
    int num = 20;

    public abstract void eat();
}

class Dog extends Animal {
    int num = 10;

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void bark() {
        System.out.println("汪汪汪...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class InterImple implements Inter {
    @Override
    public void method() {
        System.out.println("method...");
    }
}