package java_POO.ZFConcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Double> dollarRequest = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 5.01;
        });
        try {
            Double dolarRecebido = dollarRequest.get(3, TimeUnit.SECONDS);
            System.out.println("valor do dolar: " + dolarRecebido);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }
    }
}
