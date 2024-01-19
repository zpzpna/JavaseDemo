package cn.edu.hit.encapsulation;

public class Student {
    // 封装思想：合理隐藏，合理暴露
    /*封装设计规范
     * 1.私有成员变量
     * 2.针对私有的成员变量，设计对应setxxx和getxxx方法
     * 设置和获取,防止别人设置不可能的变量值，我在方法中进行限制
     *
     * */

    private int age;

    public void setAge(int age) {
        // 为了封装，防止错误设置值
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("age error");
        }
    }

    public int getAge() {
        return this.age;
    }

}
