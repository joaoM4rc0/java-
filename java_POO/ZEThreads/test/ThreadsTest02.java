package java_POO.ZEThreads.test;


class ThreadExample3 implements Runnable {
    private String c;

    public ThreadExample3(String c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            Thread.yield();
        }
    }
}
public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExample3("KA"));
        Thread t2 = new Thread(new ThreadExample3("ME"));
        t1.start();
        t1.join();
        t2.start();
    }
}

