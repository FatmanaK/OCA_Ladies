package OCA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayFormatter {
    public static void main(String[] args) {
        String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("date = " + date); //An exception is thrown at runtime

        String date1=LocalDate.now().format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date1);
       // String date2=LocalDate.from("2015-01-09").format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
