package cn.edu.hit.useapi.mtime.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeDemo {
    /*Instant直接now()获取时间戳和当前时间会有误差，因为时区不同，为此要设置市区
     * ZoneId设置时区
     * ZonedDateTime带有时区的时间*/
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);


        /*ZoneId ZonedDateTime
         * public static Set<String> getAvailableZoneIds()
         * public static ZoneId systemDefault()
         * public static ZoneId of(String zoneId)
         * ------------------------------------
         * now() 这里拿的是系统默认时区时间，
         * of 设置时间
         * with minus plus*/
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds(); // 获取java支持的所有时区
        System.out.println(availableZoneIds);
        ZoneId zoneId = ZoneId.systemDefault();     // 获取当前系统默认时区
        System.out.println(zoneId);
        ZoneId of = ZoneId.of("Africa/Nairobi");  // 获取一个指定时区
        ZonedDateTime zonedDateTime1 = Instant.now().atZone(of);
        System.out.println(zonedDateTime1);

        /*Instant
         * now()获取当前师姐标准时间时间戳
         * ofEpochMilli()修改最后的单位，选择生成不同单位的时间戳
         * atZone()获得一个有时区的时间
         * isBefore isAfter
         * minusxx plusxx类似Local系列中操作*/
    }
}
