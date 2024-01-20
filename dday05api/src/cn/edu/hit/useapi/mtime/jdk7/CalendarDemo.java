package cn.edu.hit.useapi.mtime.jdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 用于尝试Calendar的demo，一般这个类用来判断当前日期是具体的某个第几天
 */
public class CalendarDemo {
    /*创建对象：
     *   public static Calendar getInstance():获取当前的日历对象
     *
     * 常用方法：
     *  public int get(int field) 获取日历某个字段信息
     *      get中获取的参数：Calendar类中的静态常量
     *      Calendar.YEAR获取年份信息
     *  public void set(int field,int value) 修改日历的某个字段信息
     *  public void add(int field,int amount) 为某个字段增加或减少指定值*/

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    /*一般用于判断当前日期*/
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int i = c.get(Calendar.YEAR);
        System.out.println(i);

        // 注意类中的月份为0-11
        int i2 = c.get(Calendar.MONTH);
        System.out.println(i2 + 1);

        int i3 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i3);

        // 注意，外国人认为周日是一周的第一天
        /*
         *   日  一  二   三  四   五  六
         *   1   2   3   4   5   6   7
         * */
        int i4 = c.get(Calendar.DAY_OF_WEEK);
        /*如何解决输出问题：
         * 设置一个字符数组，存储对应日期字符，然后用get到的结果对应索引*/
        char[] weeks = {' ', '日', '一', '二', '三', '四', '五', '六'};
        System.out.println(weeks[i4]);
        System.out.println(i4);

        //set
        c.set(Calendar.YEAR, 2024);

        // add
        c.add(Calendar.YEAR, 1);
        System.out.println(c.get(Calendar.YEAR));

        System.out.println(isCrazy(2050, 3, 1));

        System.out.println(getDate());
    }

    /**
     * 用于判断某一个是否是疯狂星期四的函数.
     *
     * @param year  判断的年份
     * @param month 判断的月份
     * @param date  判断的日期
     * @return 是否是疯狂星期四 boolean
     */
    public static boolean isCrazy(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date);
        if (Calendar.WEDNESDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取输入的某一天是一年中的第几天
     *
     * @return the date
     */
    public static long getDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("输入日期：xxxx年xx月xx日");
        Scanner sc = new Scanner(System.in);

        String timeStr = sc.next();
//        String firstTimeStr = timeStr.substring(0, 4)+"年1月1日";
        Date mTime = simpleDateFormat.parse(timeStr);
//        Date fTime = simpleDateFormat.parse(firstTimeStr);
//        return (mTime.getTime() - fTime.getTime())/1000/3600/24+1;
        /*上面这种方法是使用Date和SimpledateFormat类*/
        /*其实可以用Calendar，Sim类只负责解析具体时间即可*/

        Calendar c = Calendar.getInstance();
        c.setTime(mTime); // 不手动设置，用时间对象设置
        return c.get(Calendar.DAY_OF_YEAR);
    }
}
