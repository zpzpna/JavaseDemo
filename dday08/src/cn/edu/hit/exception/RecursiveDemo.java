package cn.edu.hit.exception;

public class RecursiveDemo {
    /*递归：方法直接或者间接调用自己
     * 间接调用：a调用b b调用c c调用a*/
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int n) {
        if (1 == n) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
