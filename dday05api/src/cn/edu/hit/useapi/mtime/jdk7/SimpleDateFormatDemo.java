package cn.edu.hit.useapi.mtime.jdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * The type Simple data format demo.用于将Date类的默认格式改造为具体格式，或者输出
 */
public class SimpleDateFormatDemo {
    /*构造
     * public SimpleDateFormat()     构造一个SimpleDataFormat,使用默认格式
     * public SimpleDateFormat(String pattern) 指定格式构造*/

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws ParseException the parse exception
     */
    /*格式化方法
     * public final String format(Date date)     将日期格式化日期/时间字符串
     * public final Date parse(String source)    将字符串解析为日期类型*/
    public static void main(String[] args) throws ParseException {

        /*格式字符串看文档就行*/
        // 默认格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        Date date = new Date();

        String result = simpleDateFormat.format(date);

        System.out.println(result);

        // 指定格式
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        result = simpleDateFormat1.format(date);
        System.out.println(result);

        String today = "2024年1月1日";
        Date date1 = simpleDateFormat1.parse(today);
        System.out.println(date1);

        compute();
    }

    /**
     * Compute.
     *
     * @throws ParseException the parse exception
     */
    public static void compute() throws ParseException {
        /*计算用户活了多少天*/
        /*先获取用户输入时间格式，然后解析为对象，然后用时间格式获取*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("请输入生日：xxxx年xx月xx日");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();
        long birthdayTime = simpleDateFormat.parse(birthday).getTime();
        long today = new Date().getTime();
        System.out.println((today - birthdayTime) / 1000 / 60 / 60 / 24);

    }
}
