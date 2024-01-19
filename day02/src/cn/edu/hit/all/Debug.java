package cn.edu.hit.all;

public class Debug {
    public static void main(String[] args) {
        // 断点调试记住多个断点跳跃执行和单个执行的快捷键，以及启动执行的快捷键
        int age = 10;
        System.out.println(age);
        age = 15;
        System.out.println(age);
        // step over:越过函数，一次执行完函数 step into：单步执行，进入函数 step out：如果进入子函数了，立刻执行完跳出

        // 一句话可以创建多个变量，每个变量用逗号分隔
        float a = 1.1f, b = 2.3f;
    }
}