package cn.edu.hit.useapi.mobject;

public class ToStringDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
        Teacher x = new Teacher(11, "aa");
        System.out.println(x);

        /*tostring：
         * 输出对象的字符串表示
         * 默认情况下时全类名
         *
         * 而一般直接输出对象的时候，也是自动调用tostring输出*/

        /*默认方法是全类名@16进制的哈希地址*/

        /*打印没有出现地址，出现别的，说明一定重写toString*/

    }
}

class A {
    @Override
    public String toString() {
        return "我是自己的tostring";
    }
}

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}