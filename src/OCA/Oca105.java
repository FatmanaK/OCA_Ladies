package OCA;

import java.time.LocalDate;

public class Oca105 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,01,10);

        date = date.plusDays(25);
        System.out.println(date);//2012-02-04

    }
}
