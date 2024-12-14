package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2025, Month.FEBRUARY, 25);
        System.out.println(data.isLeapYear());
    }
}
