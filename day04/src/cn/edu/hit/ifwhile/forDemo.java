package cn.edu.hit.ifwhile;

public class forDemo {
    // for先做初始语句，然后判断，然后循环体，最后是条件变化语句
    // 也就是可能第一次初始后判断失败，直接退出循环体
    public static void main(String[] args) {
        forTest();
    }

    public static void forTest() {
        // 重要思路：条件判断和条件变化语句不是只有><和++ -- 也可以用函数或者其他任意操作！！！
        // 思路：求和先初始化求和变量然后累加
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1);
        }
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }

    }
}
