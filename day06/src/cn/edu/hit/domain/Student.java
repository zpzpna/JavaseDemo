package cn.edu.hit.domain;

public class Student {
    /*标准javabean：实体类编写标准
     * 1.成员变量私有化
     * 2.空参和带参构造
     * 3.私有成员变量，要有get和set方法*/

    // 合格实体类只做数据的存取，对数据的处理交给其它类来完成，实现数据和业务分离

    // alt+insert自动创建无参有参构造和set，get方法，也可以插件ptg
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (this.age > 0 && this.age < 120) {
            this.age = age;
        } else {
            System.out.println("error age");
        }

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
