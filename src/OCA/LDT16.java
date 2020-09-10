package OCA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LDT16 {
    public static void main(String[] args) {
        LocalDate dt= LocalDate.of(2014,7,31);
        dt=dt.plusDays(30);
        dt=dt.plusMonths(1);
        System.out.println(dt.format (DateTimeFormatter.ISO_DATE_TIME));//2014-07-31T01:01:00
    }
}
