package MyLocaData;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author LuGuoZheng
 * @date 2019/5/8 16:20
 * @Version 3.0
 * @description
 */
public class MyLocalDataDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(LocalDate.now().toString());
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(LocalDate.of(2019, 05, 06));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(2019, Month.MAY, 25));
    }
}
