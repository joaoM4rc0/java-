package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2005, 2, 26, 18,50,5);
        LocalDateTime data = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(aniversario, data);
        System.out.println(days);
    }

}
