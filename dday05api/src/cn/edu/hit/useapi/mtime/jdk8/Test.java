package cn.edu.hit.useapi.mtime.jdk8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(getAlive());
    }

    public static long getAlive() {
        /*用户输入生日，获取当前活了多少年
         *
         * 首先要获得两个Local时间点，
         * 然后用时间间隔类求差*/
        System.out.println("输入：xxxx年xx月xx日");
        Scanner sc = new Scanner(System.in);
        String timeStr = sc.next();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
        LocalDate localDate = LocalDate.parse(timeStr, dateTimeFormatter);
        LocalDate localDate1 = LocalDate.now();
        return ChronoUnit.YEARS.between(localDate, localDate1);
    }
}
