package java_POO.ZFConcorrencia.test;

import java_POO.ZFConcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService service = new StoreService();
        ProcuraPrecoCompletableFuture(service);
    }
    private static void ProcuraPrecoCompletableFuture(StoreService service) {
        Long start = System.currentTimeMillis();CompletableFuture<Double> precoFuture1 = service.getPrecoCompletableFuture("store 1 ");
        List<String> stores = List.of("store 1","store 2", "store 3", "store 4");
        List<CompletableFuture<Double>> collectFutures = stores.stream()
                .map(service::getPrecoCompletableFuture)
                .collect(Collectors.toList());
        List<Double> prices = collectFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        for (Double price : prices) {
            String valores = String.format("%.2f", price);
            System.out.println(valores);
        }

        long end = System.currentTimeMillis();
        System.out.printf("o tempo que levou para buscar o preco: %ds%n", (end-start));
    }
}
