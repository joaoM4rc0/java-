package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println();
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime zonedDateTime = data.atZone(tokyoZone);
        System.out.println(zonedDateTime.plusHours(9));

    }
}
