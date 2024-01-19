package cn.edu.hit.cla;

public class Student {
    // 注意，类中的方法没有static
    // 类中是成员变量+成员方法
    // 成员变量在方法外

    // 类 = 属性+行为
    // 如何划分属性和行为
    // 名词：属性 ，动词：行为

    // 变量可以赋值，但一般不赋值，此时内部为默认值，先创建对象后才重新赋值
    String name;
    int age;

    public void study() {
        System.out.println("studying");
    }

    public void play(String name) {
        System.out.println(this.name + "和" + name + "玩双人成行");
    }
}
