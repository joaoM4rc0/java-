package java_POO.ZFConcorrencia.test;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAllOfTest01 {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "tAREFA 1 ");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "tAREFA 2 ");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "tAREFA 3 ");

        CompletableFuture<Void> allFuture = CompletableFuture.allOf(future1, future2, future3);
        allFuture.join();
        System.out.println("Todas as tarefas foram concluídas!");
        System.out.println("Resultado da Future1: " + future1.join());
        System.out.println("Resultado da Future2: " + future2.join());
        System.out.println("Resultado da Future3: " + future3.join());
    }
}
