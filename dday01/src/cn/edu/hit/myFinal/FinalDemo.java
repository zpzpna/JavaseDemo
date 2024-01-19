package cn.edu.hit.myFinal;

public class FinalDemo {
    public static void main(String[] args) {
        /*final
         * 1.修饰父类方法：子类无法重写对应方法
         * 2.修饰变量：表示这个变量是常量，无法修改，
         * 3.修饰类：表示类是最终类
         *
         * -------------------
         * 修饰不同数据类型
         * 基本数据类型：代表数据值不可改变
         * 引用数据类型：代表地址值不可改变
         *
         * -------------------
         * 修饰成员变量
         * final修饰成员变量：不能修饰默认值。（要么定义时直接给值，要么构造方法中赋值）
         *
         * -------------------
         * final修饰变量命名规则：
         * 如果变量是一个单词，所有单词大写：MAX
         * 如果变量是多个单词，下划线分割：MAX_VALUE
         * */
    }

}

final class FFu {
    // 如果所有方法都是final修饰，可以直接在class前加final
    public void m1() {

    }

    public void m2() {

    }

    public void m3() {

    }
}

class Fu {
    // 不可以被Zi类重写
    public final void method1() {

    }
}

class Zi extends Fu {
}
