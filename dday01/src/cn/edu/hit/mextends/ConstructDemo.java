package cn.edu.hit.mextends;

public class ConstructDemo {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

/*注意：具体的空参和有参构造
 * 子类空参方法用父类空参方法，子类有参方法要用父类有参方法，见test，不可以交叉*/
// 构造方法super() 注意Fu类也有一个super()，是Object类
class Fu {
    public Fu() {
        super(); // Object类，注意很多.后奇怪的方法都是Object的方法
        System.out.println("Fu empty construct");
    }
}

class Zi extends Fu {
    public Zi() {
        System.out.println("Zi empty construct");
    }
}
