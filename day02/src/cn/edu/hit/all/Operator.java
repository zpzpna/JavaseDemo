package cn.edu.hit.all;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // 自增自减运算符，会改变原来的数值
        x++;

        System.out.println(x);
        int a = 3;
        //  4 + 4 +（5*10）
        //a++ 代表此时这个位置的a结果是原来结果，但是下一个位置的a是a+1的结果
        int b = (++a) + (a++) + (a * 10);
        System.out.println(a);
        System.out.println(b);
    }
}
