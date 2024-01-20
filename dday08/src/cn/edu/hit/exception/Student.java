package cn.edu.hit.exception;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            throw new SetAgeException("年龄范围有误，需要0-120之间年龄");
            /*异常对象中getMessage方法获取错误原因*/
            /*在这里主动new异常，并且根据面向的不同对象，选择抛出处理还是捕获处理*/
        }
    }

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        setAge(age);
        /*注意，构造方法如果有必要，要用严谨的设置方法代替基本赋值*/
    }
}
