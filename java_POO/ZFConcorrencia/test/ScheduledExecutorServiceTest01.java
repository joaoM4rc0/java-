package java_POO.ZFConcorrencia.test;

import java_POO.LeituraDoConsole._scanner;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1 );
    private static final DateTimeFormatter date =  DateTimeFormatter.ofPattern("HH:mm:ss");
    private static void Beep() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(date)+ " beep" );
        };
        executor.schedule(r, 5, TimeUnit.SECONDS);
    }
    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        Beep();
    }
}
