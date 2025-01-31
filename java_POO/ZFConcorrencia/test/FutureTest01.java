package java_POO.ZFConcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Double> dollarRequest = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 5.01;
        });
        Double dolarRecebido = dollarRequest.get();
        System.out.println("valor do dolar: " + dolarRecebido);
        executor.shutdown();
    }
}
