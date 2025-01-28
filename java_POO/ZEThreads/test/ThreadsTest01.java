package java_POO.ZEThreads.test;

//class ThreadExemple extends Thread {
//    private char c;
//
//    public ThreadExemple(char c) {
//        this.c = c;
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 500; i++) {
//            System.out.print(c);
//            if (i % 100 == 0) {
//                System.out.println();
//            }
//        }
//    }
//}

// esse faz mais sentido de fazer

class ThreadExample2 implements Runnable {
    private char c;

    public ThreadExample2(char c) {
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
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadsTest01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample2('A'));
        Thread t2 = new Thread(new ThreadExample2('B'));
        Thread t3 = new Thread(new ThreadExample2('C'));
        Thread t4 = new Thread(new ThreadExample2('D'));
        Thread t5 = new Thread(new ThreadExample2('E'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
