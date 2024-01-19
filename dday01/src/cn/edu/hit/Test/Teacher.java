package cn.edu.hit.Test;

public class Teacher extends People {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age); // 这里就是子类有参构造使用父类有参构造，会用父类的方法进行构造
    }

    public void teach() {
        System.out.println(super.getName() + "正在上课"); // 用父类初始化的东西需要用父类操作
    }
}
