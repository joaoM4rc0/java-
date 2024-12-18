package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        String s1 = data.format(DateTimeFormatter.ISO_DATE);
        String s2 = data02.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s2);
        LocalDate parse1 = LocalDate.parse("2021-02-09", DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter formartterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattBR = LocalDate.now().format(formartterBR);
        System.out.println(formattBR);


    }
}
