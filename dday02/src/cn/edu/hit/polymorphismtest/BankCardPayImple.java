package cn.edu.hit.polymorphismtest;

public class BankCardPayImple implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("银行卡支付：" + money);
    }
}
