package cn.edu.hit.block;

public class BlockDemo {
    /*代码块：{}括起来的代码块
     * 1.局部代码块
     *       位置：方法中的一对大括号
     *       作用：限定变量生命周期，提前释放内存
     * 2.构造代码块
     *       位置：类中方法外的一对大括号
     *       特点：创建对象执行构造方法时：执行构造代码块（优先于构造方法实行）（构造代码块—+构造方法一块执行）
     *              - 编译后，这个逻辑会分散到所有构造方法中
     *       作用：将多个构造方法重复的代码抽取，提高复用性
     *
     * 3.静态代码块
     *       位置：类中方法外一堆大括号，需要加入static关键字，会在类加载时被执行
     *              - 由于类只加载一次，这个东西也只执行一次
     *       作用：用于数据初始化 | 用于数据加载--JDBC*/


    public static void main(String[] args) {
        {
            int num = 10;
            System.out.println(num);
        }
        // num = 1; 上面就是局部代码块，这里发现过了上面的代码块中，就会释放掉num变量
        {
            Student stu1 = new Student();
            Student stu2 = new Student(14);
        }
    }
}

class Student {

    static String school;

    static {
        school = "HIT";
        // 虽然简单变量可以直接初始化，但是复杂对象数据初始化，还是得用代码块
    }

    {
        System.out.println("构造代码块");
        System.out.println("好好学习");
    }

    public Student() {
        System.out.println("这是无参构造方法");
    }

    public Student(int age) {
        System.out.println("这是带参构造方法");
    }
}