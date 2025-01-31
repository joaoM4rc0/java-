package java_POO.ZFConcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class printar implements Runnable {
    private final int num;

    public printar(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s iniciou: %d%n", Thread.currentThread().getName(), num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finalizou: %d%n", Thread.currentThread().getName(), num);
    }
}
public class ExecutorsTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new printar(1));
        executorService.execute(new printar(2));
        executorService.execute(new printar(3));
        executorService.execute(new printar(4));
        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println("programa finalizado");
    }
}
