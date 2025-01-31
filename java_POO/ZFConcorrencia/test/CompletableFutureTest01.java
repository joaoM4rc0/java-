package java_POO.ZFConcorrencia.test;

import java_POO.ZFConcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService service = new StoreService();
//        ProcuraPreco(service);
//        ProcuraPrecoFuture(service);
        ProcuraPrecoCompletableFuture(service);
    }
//    private static void ProcuraPreco(StoreService service) {
//        Long start = System.currentTimeMillis();
//        System.out.println(service.getPrice("store 1 "));
//        System.out.println(service.getPrice("store 2 "));
//        System.out.println(service.getPrice("store 3 "));
//        System.out.println(service.getPrice("store 4 "));
//        long end = System.currentTimeMillis();
//        System.out.printf("o tempo que levou para buscar o preco: %ds", (end-start));
//    }
//    private static void ProcuraPrecoFuture(StoreService service) {
//        Long start = System.currentTimeMillis();
//        Future<Double> precoFuture1 = service.getPrecoFuture("store 1 ");
//        Future<Double> precoFuture2 = service.getPrecoFuture("store 2 ");
//        Future<Double> precoFuture3 = service.getPrecoFuture("store 3 ");
//        Future<Double> precoFuture4 = service.getPrecoFuture("store 4 ");
//        try {
//            System.out.println(precoFuture1.get());
//            System.out.println(precoFuture2.get());
//            System.out.println(precoFuture3.get());
//            System.out.println(precoFuture4.get());
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }finally {
//            service.shutDown();
//        }
//        long end = System.currentTimeMillis();
//        System.out.printf("o tempo que levou para buscar o preco: %ds%n", (end-start));
//    }
    private static void ProcuraPrecoCompletableFuture(StoreService service) {
        Long start = System.currentTimeMillis();CompletableFuture<Double> precoFuture1 = service.getPrecoCompletableFuture("store 1 ");
        CompletableFuture<Double> precoFuture2 = service.getPrecoCompletableFuture("store 2 ");
        CompletableFuture<Double> precoFuture3 = service.getPrecoCompletableFuture("store 3 ");
        CompletableFuture<Double> precoFuture4 = service.getPrecoCompletableFuture("store 4 ");

        System.out.println(precoFuture1.join());
        System.out.println(precoFuture2.join());
        System.out.println(precoFuture3.join());
        System.out.println(precoFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("o tempo que levou para buscar o preco: %ds%n", (end-start));
    }
}
