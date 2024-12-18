package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjudtersTest {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate linhaDoTempo = data.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

        System.out.println(linhaDoTempo);
    }
}
