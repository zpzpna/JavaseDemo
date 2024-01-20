package cn.edu.hit.useapi.mtime.jdk8;

import java.time.LocalDateTime;

public class CalendarDemo {
    /*LocalTime
     * LocalDate
     * LocalDateTime
     *
     * 创建对象：
     * now()根据当前时间创建对象
     * of() 根据输入的参数创建对象
     * -----------------------------------------------
     * LocalDateTime转换为LocalDate和LocalTime
     * toLocalDate()
     * toLocalTime()
     * -----------------------------------------------
     * 获取具体时间：
     * getxxx
     * -----------------------------------------------
     * 获得新的时间对象plusxx，minusxxx，withxxx
     * 其中with不依赖原时间创建修改后全新对象
     * plus和minus是在原来时间变化后创建新对象
     *
     * -----------------------------------------------
     * 比较时间相同或是前后
     * equals()
     * isBefore()
     * isAfter()*/
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2001, 11, 13, 1, 1, 1);
        System.out.println(ldt2);

        ldt.toLocalDate();
        ldt.toLocalTime();

        //注意get具体值如果没有可能要找Value对应方法
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfWeek().getValue());

//        一次只能变换一个属性，如果要修改多个属性，可以用of
        ldt.plusYears(1L).minusYears(1L).withYear(2211);

//    时间比较
        ldt.isAfter(ldt2);
        ldt.isBefore(ldt2);
        ldt.equals(ldt2);
    }

}
