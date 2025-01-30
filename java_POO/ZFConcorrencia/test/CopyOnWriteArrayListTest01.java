package java_POO.ZFConcorrencia.test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> integers = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            integers.add(i);
        }
        Runnable runnableIterator = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                integers.iterator().forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable runnableRemove = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), integers.remove(i));
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemove).start();

    }
}
