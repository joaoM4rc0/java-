package java_POO.ClassesUtilitarias.DDate.Test;



import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime dataHj = LocalDateTime.now();
        LocalDateTime data2HorasDps = LocalDateTime.now().plusHours(2);
        LocalDateTime data2AnosDps = LocalDateTime.now().plusYears(2);
        Duration duration = Duration.between(dataHj, data2AnosDps);
        System.out.println(Duration.ofDays(5));
    }
}
