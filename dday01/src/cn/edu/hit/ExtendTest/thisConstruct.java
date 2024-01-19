package cn.edu.hit.ExtendTest;

public class thisConstruct {
    public static void main(String[] args) {

    }
}
/*项目version1.0:A有3个变量*/
/*项目version1.1:A有4个变量*/

/*开闭原则：对扩展功能开放，对修改原有代码关闭*/
/*用this()调用自己本类的构造方法，从而扩展原来构造方法*/

/*this()和super()都需要在构造方法第一行位置，使用this会不会不用super？
 * 不会，因为this调用的原来的类构造方法必有super，或者说，不断溯源必定找到一个super*/
class A {
    int a;
    int b;
    int c;
    int d; // 后面版本加入

    public A(int a, int b, int c) {
        // 1.0ver
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
        // 1.1ver
        this(a, b, c);
        this.d = d;
    }
}