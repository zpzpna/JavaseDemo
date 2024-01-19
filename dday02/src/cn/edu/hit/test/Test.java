package cn.edu.hit.test;

import cn.edu.hit.bag1.Student;

public class Test {
    public static void main(String[] args) {
        /*如果两个包有同名类，一个可以导包直接用，但是另一个用全类名才可以创建*/
        /*同理：如果我创建的类名和工具类名冲突，会优先用我创建的类，其他类需要用全类名才行
         * 例如java.util包中Scanner，我有一个Scanner类的话，以后就只能用java.util.Scanner才可以创建*/

        /*包名代码一定是第一行代码
         * 不同包中类的使用一定要进行导包操作！*/

        Student stu = new Student();
        cn.edu.hit.bag2.Student stu2 = new cn.edu.hit.bag2.Student();
    }
}
