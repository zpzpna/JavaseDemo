package cn.edu.hit.minterface;

public class Difference {
    /*类，接口的关系：
     *       1.类是继承关系，只能单实现
     *       2.类和接口是多实现关系，可以多实现
     *
     *       接口多实现不存在逻辑冲突，因为并没有实际实现
     *
     *       3.接口和接口是继承关系，可以单继承也可以多继承，因为没有实际实现，所以没有逻辑关系*/

    /*抽象类和接口对比
     * 构造方法：抽象类有，接口无
     *
     * 成员变量：抽象类有常量变量，接口只有常量
     *
     * 成员方法：抽象类可以是普通或抽象方法，接口只能是抽象方法
     *
     * 抽象类应用：本质还是对事务抽象，例如公司人员父类为抽象类
     *
     * 接口应用场景：写业务前，先用接口规定对应规则，然后再用类实现
     * 抽象类：对事物抽象（描述事物）
     * 接口：对行为抽象（制定规则）*/
}

interface A {
    void show();
}

interface B {
    void show();
}

interface C extends A, B {
    void showC();
}

class Z implements A, B {
    // 两个接口只用重写一个，因为定义了一个同样的规则
    public void show() {
        System.out.println("学习打游戏");
    }
}

class D extends Z implements A, B {
    /*可以在继承后实现接口*/
}
