package java_POO.ZFConcorrencia.test;

import java_POO.ZFConcorrencia.dominio.Quote;
import java_POO.ZFConcorrencia.service.StoreServiceDeprecated;
import java_POO.ZFConcorrencia.service.StoreServiceDesconto;

import java.security.Provider;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceDesconto service = new StoreServiceDesconto();
        procuraProDescontoAssincrona(service);
    }
//    private static void procuraProDesconto(StoreServiceDesconto service) {
//        List<String> stores = List.of("store 1","store 2","store 3");
//
////        stores.forEach(s -> System.out.println(service.getPrice(s)));
//        List<String> servicos = stores.stream()
//                .map(service::getPrice)
//                .map(Quote::newQoate)
//                .map(service::aplicandoDesconto)
//                .collect(Collectors.toList());
//        servicos.forEach(System.out::println);
//    }
    private static void procuraProDescontoAssincrona(StoreServiceDesconto service) {
        Long start = System.currentTimeMillis();
        List<String> stores = List.of("store 1","store 2","store 3");
        List<CompletableFuture<String>> collectFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPrice(s)))
                .map(cf -> cf.thenApply(Quote::newQoate))
                .map(cf ->
                        // thenCompose está compondo o primeiro completableFuture
                        cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.aplicandoDesconto(quote))))
                .collect(Collectors.toList());
        collectFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("o tempo que levou para buscar o preco: %ds%n", (end-start));
    }
}
