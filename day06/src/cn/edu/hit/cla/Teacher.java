package cn.edu.hit.cla;

public class Teacher {
    // 构造方法：没有写会有默认的构造方法,无参，无函数体的构造方法
    // 手动编写了就不会有默认的无参构造方法
    /*构造器格式：
     * 1.方法名和类名相同
     * 2.没有返回值类型，void也不行，
     * 3.没有返回值return*/
    /*执行时机：创建对象时执行，
     * 一般用于创建对象的初始化操作*/
    String name;
    int age;

    /*无参有参构造
     * 可以无限重载，但一般写一个有参构造和一个无参构造，
     * 不可以用.调用*/
    public Teacher() {

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是老师");
    }
    /*封装：将要处理的数据和处理数据的方法封装进对象中
     * 需要用权限修饰符合理隐藏和暴露*/

    /*权限修饰符
     * private：只能在同一个类中使用
     * （default）：同一个类，同一个包中使用，这个是默认权限，也就是无修饰符
     * protected：同一个类，同一个包，不同包的子类
     * public：可以任意位置访问，注意：是同一个模块任意访问*/


}
