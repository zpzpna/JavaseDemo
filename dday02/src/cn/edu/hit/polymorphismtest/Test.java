package cn.edu.hit.polymorphismtest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*多态好处就是行为多态方面，将对象抽象，从而所有类别行为都是同一个方法*/
        System.out.println("请选择你的支付方式：");
        System.out.println("1.支付平台\n2.银行卡\n3.信用卡快捷支付");
        Scanner sc = new Scanner(System.in);
        int way = sc.nextInt();

        /*抽象类不能实例化也就是不能new，但是抽象类的引用可以指向子类，
         * 同理，接口引用可以指向子类，也可以指向实现它的具体类*/
        Payment payment = null;

        switch (way) {
            case 1:
                payment = new PlatformPayImple();
                break;
            case 2:
                payment = new BankCardPayImple();
                break;
            case 3:
                payment = new CreditCardPayImple();
                break;
            default:
                System.out.println("选择错误");
                break;

        }
        System.out.println("请输入你要支付的金钱数目");
        double money = sc.nextDouble();
        assert payment != null;
        payment.pay(money);

    }
}
