package java_POO.ZFConcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
         BlockingQueue<String> list = new ArrayBlockingQueue<>(1);
         list.put("joao");
         System.out.printf("%s adicionou ao list o valor: %s%n", Thread.currentThread().getName(), list.peek());
         System.out.println("tentando adicionar outro valor ");
         new Thread(new remove(list)).start();
         list.put("maria");
         System.out.printf("novo valor adicionado: %s%n", list.peek());

    }
    static class remove implements Runnable {
        private final BlockingQueue<String> bq;

        public remove(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.printf("%s valor removido %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
}
