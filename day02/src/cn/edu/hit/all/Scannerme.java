package cn.edu.hit.all;

import java.util.Scanner;

public class Scannerme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double salary = sc.nextDouble();
        boolean marry = sc.nextBoolean();
        String name = sc.next();
        // next遇到空格换行制表符就停了，nextline输入一行，用next要while计数
        // 字符串拼接 +
        System.out.println(name + num);
    }
}
