package java_POO.ZFConcorrencia.test;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAnyOfTest01 {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "TAREFA 1 ";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1501);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "TAREFA 2 ";
        });
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "TAREFA 3 ";
        });
        CompletableFuture<Object> futureAnyOf = CompletableFuture.anyOf(future1, future2, future3);

        Object result = futureAnyOf.join();
        System.out.println("Resultado da primeira tarefa concluída: " + result);
    }
}
