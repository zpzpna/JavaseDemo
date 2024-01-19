package cn.edu.hit.cla;

public class StudentTest {
    public static void main(String[] args) {
        // 有主方法的类一般是测试类
        Student stu = new Student(); // 创建对象
        stu.name = "ldz";
        System.out.println(stu);     // 全类名@内存，堆内存中：全类名->包名+类名
        stu.study();                 // 调用
        stu.play("llb");

        /*注意，加载内存顺序，先是测试类进方法区，因为main被首先调用，然后是main进栈，接着要用Student类，Student字节码进方法区
         * 接着继续*/

        /*成员变量和局部变量区别:
         * 位置：成员变量在方法外
         * 默认值：成员变量有，局部变量无
         * 内存位置：成员变量在堆，局部变量在栈
         * 生命周期：成员变量随对象消失，局部变量随方法结束消失
         * 作用域：自己所属的括号
         * */

        // 局部变量和成员变量重名：会出现就近原则，因此要用this关键字，区分局部变量和成员变量的使用
        // 由于this代表堆地址，使用this就是访问堆中变量，所以可以区分
        // this是什么？this本身代表当前对象的地址，可以sout看看

        /*this.省略规则：
         * 本类成员方法：没有前提条件，可以省略，
         * 本类成员变量：方法中没有重名变量可以省略
         * */

        //对象回收：一个被创造的对象的地址，如果没有记录他的引用，就会被垃圾回收器回收
    }
}
