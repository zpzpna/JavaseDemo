package cn.edu.hit.ExtendTest;

public class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        /* 省略方法：
         *子类中如果没有重新创建父类中变量，此时继承的父类变量本身也是子类变量，
         *也就是说，this此时和super都可以用来获得这个变量，如果同时方法中没有对应的形参，
         *就可以省略this和super
         *对于父类方法同理*/
        System.out.println("姓名为" + getName() + ",年龄为" + getAge() + ",工资为" + getSalary() + "的程序员正在编写代码");
    }
}
