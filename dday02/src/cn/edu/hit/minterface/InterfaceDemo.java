package cn.edu.hit.minterface;

public class InterfaceDemo {
    /*接口：声明规则，java中更多是动作的抽象*/
    /*一个类所有组成是抽象方法，一般会将这种类设计为接口，它的价值只有声明规则*/
    /*实体类，工具类，接口，最终类*/

    // 接口和抽象类一样，不能实例化
    /*接口和类之间是实现关系，用implement来完成*/
    public static void main(String[] args) {
        InterImple ii = new InterImple();
        ii.method();
    }

}

interface inter {
    /*也可以直接创建一个接口文件*/

    /*接口特点：
     * 1.中没有构造方法，super访问的是谁？Object
     * 2.接口本质上不是继承
     * 3.接口中成员特点
     *       - 成员变量：只能定义常量，即使不输入，也会自动添加public static final
     *       -           所以一般要大写，因为常量名字大写
     *       -           本质上这三个关键字没有顺序关系
     *
     *       - 成员方法：只能是抽象方法，因为接口中成员方法只能是抽象方法，会自动加入public abstract
     *
     *       - 构造方法：没有
     * */
    void show();

    // 如下 没必要手打 public abstract
    public abstract void method();
}

class InterImple implements inter {
    /*处理两种实现接口方式：
     * 1.实现所有抽象方法，
     * 2.也变成抽象类
     * !!!不过，一般实现了接口，就会直接实现所有抽象方法*/
    @Override
    public void show() {
        System.out.println("show..");
    }

    @Override
    public void method() {
        System.out.println("method");

    }
}

abstract class InterImple2 implements inter {
}