package cn.edu.hit.design.adapter;

public class AdapterDemo {
    /*适配器设计模式：
     * 解决接口和接口实现类之间的问题：
     * 接口有多个方法，但是有的实现类只需要一个方法重写
     *
     * 设计模式具体：
     * 用一个类实现接口，并且这个类空实现所有的接口抽象方法
     * 接着我要用时，我就用这个类对应的匿名内部类，或者写一个子类就行
     * 由于这个类本身没有意义，所以这个类要设置为抽象类
     *
     * 为了形容这个类夹在接口和子类间，称为适配器
     * 要具体使用的时候，使用子类继承适配器类重写要用的方法就行了*/


    /*注意：对于KeyListener就有一个官方写的适配器KeyAdapter*/
}

interface Priest {
    void sit();

    void sing();

    void attack();


}

abstract class PriestAdapter implements Priest {
    @Override
    public void sit() {

    }

    @Override
    public void sing() {

    }

    @Override
    public void attack() {

    }
}
