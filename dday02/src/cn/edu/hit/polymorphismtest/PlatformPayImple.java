package cn.edu.hit.polymorphismtest;

public class PlatformPayImple implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("平台支付：" + money);
    }
}
