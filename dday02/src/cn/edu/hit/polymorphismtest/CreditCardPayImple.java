package cn.edu.hit.polymorphismtest;

public class CreditCardPayImple implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("信用卡支付：" + money);
    }
}
