package cn.edu.hit.mystatic;

public class staticDemo {
    /*static特点
     *       1.被类的所有对象共享
     *       2.多了类名调用方式
     *       3.随着类的加载而加载,优先于对象存在*/
    /*使用场景
     * 成员变量:所有对象需要共享--例如在线人数
     * 成员方法:所有对象都可以使用的方法--例如工具类*/

    /*重要注意点:
     * 静态方法中只能访问静态成员(直接访问)
     * 因为内存加载时,静态成员和方法随着.class文件一起加载,但是非静态成员只有创建对象之后才可以加载,
     * 所以静态变量访问这些成员时会出问题
     * 因此有了static后,方法就只允许访问静态成员变量和方法
     *
     * 静态方法中不能使用this关键字
     * 因为this代表对象堆地址,而这也是创建对象后才可以存在的*/
    int a = 29;

    public static void main(String[] args) {
        /*重新认识main:
         * main为什么加static:不加的话,main方法就需要创建test对象后才可以调用.加了之后不用创建对象就可以直接调用.
         * 由于main是静态的,所以main中直接调用方法也必须是静态的
         * 方法调用:静态->直接调用;非静态->创建对象后,用对象调用
         *
         * public:代表main被访问权限高,可以被jvm调用
         * static:代表main是静态方法,不用创建对象可以被jvm直接调用
         * void:代表不返回数值给虚拟机
         * String[] args :以前用于获取键盘录入的,但是由于Scanner所以没有了作用,作为传统保留*/


        Student.school = "hit";
    }

    public static void getMax() {
        // int b = a; 会报错!
    }
}
