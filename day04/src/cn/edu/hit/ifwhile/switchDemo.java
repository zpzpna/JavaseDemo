package cn.edu.hit.ifwhile;

import java.util.Scanner;


// if和switch使用区别：
// 范围使用if
// 具体数值使用switch
public class switchDemo {
    // 注意：switch只能用byte，short，char，int类型
    // jdk5之后可以用枚举，jdk7之后可以用String字符串
    // 注意：case后面不能是变量
    public static void main(String[] args) {
        switchTestJDK14();
    }

    public static void switchTest() {
        // 这里显示的是普通的switch的穿透现象，没有break就会穿透
        // 以后开发一般用这个jdk8版本

        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("holiday");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    public static void switchTestJDK14() {
        // jdk14后可以case直接填写多个选项，用冒号就要加break

        lo:
        while (true) {
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            switch (week) {
                case 1, 2, 3, 4, 5:
                    System.out.println("weekday");
                    break lo;
                case 6, 7:
                    System.out.println("holiday");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }

    public static void switchTestJDK14Plus() {
        // plus版本使用箭头，自动取代了原来的冒号，注意，JKDK14后才能一行多选和使用plus版本
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("holiday");
            default -> System.out.println("error");
        }
    }


}
