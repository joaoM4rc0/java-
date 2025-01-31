package java_POO.ZFConcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> queue = new LinkedTransferQueue<>();

        Thread tranfere = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " está transferindo elemento...");
                queue.transfer("Neymar voltou para o santos");
                System.out.println("elemento tranferido com sucesso...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "tranferidor");

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000);
                String elementoTransferido = queue.take();
                System.out.println("consumidor recebeu: " + elementoTransferido);
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        tranfere.start();
        consumer.start();
        tranfere.join();
    }
}
