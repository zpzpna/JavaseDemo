package cn.edu.hit.useapi.mbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        /*由于计算机自身特性，会导致小数运算最后尾部留有多余值*/
        System.out.println(0.1 + 0.2);
        /*public BigDecimal(double val)*/
        /*本质上，将浮点数转为bd类对象非常精确，但实际使用却有误差
         * 这不是bd类的问题，而是他会将浮点数原本数值转为对应值
         *
         * 也就是说：浮点数本来就有误差，即使用这种构造方法转化，也是本来有误差的浮点数转化*/
        /*-------------------------------------------------------------
         * 上面操作不精确，下载操作推荐*/
        /*public BigDecimal(String val)*/
        /*public static BigDecimal valueOf(double val)*/
        /*这个ValueOf 本身是将浮点数调用了Double.toString()后使用了浮点数构造*/
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.3);

        /*实际使用操作*/
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        // System.out.println(bd1.divide(bd2)); //这种除法会遇到除数为0

        // 选择保留小数点后几位，以及舍入模式
        /*分别是，偶数数字进一，
         * 数字永远变大
         * 数字永远变小*/
        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));
        System.out.println(bd1.divide(bd2, 2, RoundingMode.UP));
        System.out.println(bd1.divide(bd2, 2, RoundingMode.DOWN));

        /*注意，运算后都是生成BigDecimal对象，要用操作返回*/
        System.out.println(bd1.doubleValue());
    }
}
