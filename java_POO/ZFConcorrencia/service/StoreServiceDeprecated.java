package java_POO.ZFConcorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public Double getPrice(String store) {
        System.out.println(store + " está gerando preco");
        return geradorPreco();
    }
    private Double geradorPreco() {
        System.out.println("gerando preco...");
        delay();
        return ThreadLocalRandom.current().nextDouble(1, 500) * 10;
    }
    public void shutDown() {
        ex.shutdown();
    }
    private void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
