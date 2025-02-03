package java_POO.ZFConcorrencia.test;

import java_POO.ZFConcorrencia.service.StoreService;
import java_POO.ZFConcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        ProcuraPrecoCompletableFuture(storeService);
    }
    private static void ProcuraPrecoCompletableFuture(StoreServiceDeprecated service) {
        Long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("store 1","store 2", "store 3", "store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPrice(s),executorService ))
                .collect(Collectors.toList());
        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("o tempo que levou para buscar o preco: %ds%n", (end-start));
        executorService.shutdown();
    }
}
