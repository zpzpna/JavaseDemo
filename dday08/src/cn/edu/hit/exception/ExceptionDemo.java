package cn.edu.hit.exception;

import java.util.Scanner;

public class ExceptionDemo {
    /*查看异常：从下往上看
     * 1.查看异常位置
     * 2.异常名称
     * 3.异常原因
     *
     * 所有异常都是类实现的，如果遇到不认识异常，就去查看文档 */
    /*异常体系结构
     * Throwable 异常父类
     * ------------------------------------------------------------
     * -Error（严重错误）                             -Exception
     * ------------------------------------------------------------
     *  stackOverFlowError （栈内存溢出）              -RunTimeException和子类       -除了运行时异常所有异常（编译时异常:表面可以过编译，但是实际编译可能出错）
     *                                             编译阶段无错误，运行可能有问题         编译时异常需要在运行前给出解决方案，主要起到提醒作用
     *  OutOfMemoryError（堆内存溢出）              -----------------------------------------------------*/

    /*异常处理方式：
     *
     * 默认：
     * 遇到异常了，就会在这里创建一个异常对象 比如：new ArithmeticException()
     * 然后把对象向上抛出，抛给调用者，
     * 直到抛出给JVM虚拟机，
     * jvm收到异常对象后，先输出异常数据，然后中止java程序
     *
     * 1.try...catch捕获异常
     *       好处：异常可以被捕获，后续代码继续执行
     * 格式：
     *   try{可能抛出异常代码}catch(异常类名 对象名){异常处理方式}
     *
     * 2.抛出异常*/
    public static void main(String[] args) {
        try {
            int[] arr = null;
            System.out.println(arr[1]);
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("捕获了异常");
        } catch (NullPointerException e) {
            System.out.println("over");
        }
        /*可以多个catch连续写，或者只用一个catch，但是用Exception来捕获所有异常
         *
         * 一般用多个catch捕获，最大的异常要放在最后！*/

        /*异常实战*/
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        String name = sc.nextLine();
        stu.setName(name);
        int age = 0;

        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                break;/*这里很妙，因为为了重新输入，首先要循环，然后要退出循环，只要不处罚异常，自然直接退出循环*/
            } catch (NumberFormatException e) {
                System.out.println("请重新输入整数年龄");
                e.printStackTrace();// 这个不会中止代码，只是途中展示出现异常的信息
            } catch (SetAgeException e) {
                System.out.println("请输入0-120间的数字");
            }
        }
        stu.setAge(age);

        /*第二种处理异常方式：抛出异常，在调用产生异常部分 用throws 异常类 抛出异常
         *
         * 这代表声明可能出现异常，但是不管，实际上不解决异常，只是声明可能有异常出现
         * throw后可以声明多个异常类，逗号分割
         * */

        /*两种异常处理方式选择：
         *
         * 正在处理异常是否需要暴露：
         * 1.需要--捕获异常
         * 2.不需要--抛出异常
         *
         * 抛出异常：比如我的操作，明明没有问题，但是别人用代码的时候，传入错误参数，我不该替他处理，而是抛出
         *
         * 上述两种操作年龄的异常处理方式：
         * 1.对于另一个程序员，要抛出给他看错误 ----在main抛出
         * 2.对于用户，不要抛给他看，而是自己处理给出提示 ---将set放进try，在底下抓Exception
         * */

        /*抛出细节：
         * 抛出编译时异常必须，
         * 运行时异常没必要*/


        /*Throwable有两个方法
         * getMessage和printStackTrace*/

        /*子类写父类方法时，不抛出比父类大的或是没有的异常
         *
         * 一般子类抛出异常而父类没有时，使用子类捕获不抛出*/
    }


}
