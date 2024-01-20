package cn.edu.hit.useapi.mtime.jdk8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    /*1.获取对象
     *   public static DateTimeFormatter ofPattern(格式)
     *
     * 2.格式化:
     *   String format(事件对象)：按照指定方式格式化
     *
     * 3.解析：
     *   LocalDateTime.parse("解析字符串"，格式化对象)
     *   LocalDate.parse("解析字符串"，格式化对象)
     *   LocalTime.parse("解析字符串"，格式化对象)*/

    public static void main(String[] args) {
        // 1.创建时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
        // 2.解析
        LocalDate localDate = LocalDate.parse("2008年01月01日", formatter);
        System.out.println(localDate);
    }
}
