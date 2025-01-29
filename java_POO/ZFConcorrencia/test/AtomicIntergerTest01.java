package java_POO.ZFConcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;

class Count {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();

    void incrementa() {
        count++;
        this.atomicInteger.incrementAndGet();
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getCount() {
        return count;
    }
}
public class AtomicIntergerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                count.incrementa();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.getCount());
        System.out.println(count.getAtomicInteger());
    }
}
