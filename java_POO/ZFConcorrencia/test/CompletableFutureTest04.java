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
        procuraProDesconto(service );
    }
    private static void procuraProDesconto(StoreServiceDesconto service) {
        List<String> stores = List.of("store 1","store 2","store 3");

//        stores.forEach(s -> System.out.println(service.getPrice(s)));
        stores.stream()
                .map(service::getPrice)
                .map(Quote::newQoate)
                .map(service::aplicandoDesconto)
                .forEach(System.out::println);
    }
}
