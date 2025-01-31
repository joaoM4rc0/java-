package java_POO.ZFConcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public Double getPrice(String store) {
        System.out.println(store + " está gerando preco");
        return geradorPreco();
    }
    public Future<Double>getPrecoFuture(String store) {
        System.out.println(Thread.currentThread().getName() + " está gerando preco...");

        return ex.submit(this::geradorPreco);
    }
    public CompletableFuture<Double> getPrecoCompletableFuture(String store) {
        System.out.println(Thread.currentThread().getName() + " está gerando preco...");

        return CompletableFuture.supplyAsync(this::geradorPreco);
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
