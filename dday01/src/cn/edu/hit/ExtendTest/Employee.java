package cn.edu.hit.ExtendTest;

public class Employee {
    // 案例：写一个程序员类和经理类
    private String name;
    private int age;
    private double salary;

    public Employee() {

    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work() {
        System.out.println("员工：" + name + ",年龄：" + age + ",薪水：" + salary);
    }

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
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
