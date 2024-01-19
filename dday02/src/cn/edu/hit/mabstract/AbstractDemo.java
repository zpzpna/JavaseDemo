package cn.edu.hit.mabstract;

public class AbstractDemo {
    /*抽象类：
     * 是一种特殊的父类，可以写抽象方法
     *
     * 抽象方法：
     * 将共性的方法抽取到父类中，发现在父类中无法描述清楚
     * 而且还是子类必须有的类，就可以设计为抽象方法
     *
     * 语法
     * 类名前需要abstract
     * 方法前也需要abstract
     * 子类一定要对抽象类重写*/
}

/*一般方法第二个关键字可以换static，final，abstract
 * 类前面可以为abstract，final类*/
/*abstract冲突：
 * 与static，final，private冲突，第一个是类名调用抽象方法，后两个是不可改写抽象方法*/

abstract class Animal {
    public Animal() {

    }

    /*抽象类注意事项：
     * 1.抽象类不能实例化，不然就可以使用抽象方法
     * 2.抽象类存在构造方法：交给子类用super访问
     * 3.抽象类可以存在普通方法
     * 4.抽象类的子类：要么重写所有内部的抽象方法，要么子类也变成一个抽象类
     *   多个抽象类继承：大->中->小*/
    public abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
