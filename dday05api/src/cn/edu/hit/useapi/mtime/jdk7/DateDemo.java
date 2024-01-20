package cn.edu.hit.useapi.mtime.jdk7;

import java.util.Date;

/**
 * Date类的demo，用于时间长度的获取设置和计算
 */
public class DateDemo {
    /*Data类
     * java.util下
     *
     * 构造：
     * public Date()             当前时间构造
     * public Date(long time)    时间毫秒值构造
     *
     * public long getTime()             返回从1970、1、1的零点到现在对象对应的总毫秒
     * public void setTime(long time)    设置对象时间为传入毫秒值对应时间
     * */


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(0L);
        System.out.println(d2);

        System.out.println(d1.getTime());

        Date d3 = new Date(1L);

        d3.setTime(0L);

    }


}
