package cn.edu.hit.useapi.mobject;

import java.util.Objects;

public class EqualsDemo {

}


class Teacher {
    private int age;
    private String name;

    public Teacher(int age, String name) {
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

    public boolean myequals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher t = (Teacher) obj;
            return t.age == age && t.name.equals(name);
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        /*注意：
         * 为了防止空指针异常，这里和objects组合设计，
         * obkects中保证了本类不为null，
         * 本类equals保证比较的参数不为null
         *
         * 比较对象相等：
         * 一是比较地址值直接相同
         * 而是看是否空和类名
         * 三十比较具体值，如果有对象成员，用objects*/
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;// 过了这一步，下一步只能是Teacher类
        Teacher teacher = (Teacher) o;
        return this.age == teacher.age && Objects.equals(this.name, teacher.name);
        /*objects方法：继承object
         * 一般用两个静态方法，equals和isNull
         * 一个判断对象是否相同，一个判断是否为空*/

        /*Objects方法equals依赖于自己编写的equals
         * 好处：内部带有一个非空判断！可以避免传null产生空指针异常,
         *
         * 比如a.equals(b),如果a为空，会报错，但是objects会先检查是否为空*/

        /*要认真掌握idea的toString代码和Objects中的equals代码！*/


    }

}