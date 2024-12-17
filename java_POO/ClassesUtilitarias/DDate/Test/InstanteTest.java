package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.Duration;
import java.time.Instant;

public class InstanteTest {
    public static void main(String[] args) {
        Instant data = Instant.now();
        System.out.println(data);

        Instant epoca = Instant.ofEpochMilli(1528282);
        System.out.println(epoca);

        Instant later = data.plus(Duration.ofHours(5));

        System.out.println(later);
    }

}
