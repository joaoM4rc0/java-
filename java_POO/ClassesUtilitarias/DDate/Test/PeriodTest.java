package java_POO.ClassesUtilitarias.DDate.Test;


import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        LocalDateTime dataEmAnosDps = LocalDateTime.now().plusYears(80).plusDays(28);
        Period period = Period.between(data.toLocalDate(), dataEmAnosDps.toLocalDate());
        System.out.println(period);

    }
}
