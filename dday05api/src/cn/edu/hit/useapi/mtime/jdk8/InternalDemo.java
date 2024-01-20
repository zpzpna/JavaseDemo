package cn.edu.hit.useapi.mtime.jdk8;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*Period，Duration，ChronoUnit*/
public class InternalDemo {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2024, 1, 1);//后一个减前一个
        Period period = Period.between(localDate2, localDate1);
        System.out.println(period.getDays());
        /*durarion类似，不过获取相差值用toxxx*/

        /*ChronoUnit*/
        System.out.println(ChronoUnit.DAYS.between(localDate2, localDate1));
    }
}
