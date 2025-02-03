package java_POO.ZFConcorrencia.service;

import java_POO.ZFConcorrencia.dominio.Desconto;
import java_POO.ZFConcorrencia.dominio.Quote;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class StoreServiceDesconto {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public String getPrice(String store) {
        double priceGerado = geradorPreco();
        Desconto.Qode value = Desconto.Qode.values()[
                ThreadLocalRandom.current().nextInt(Desconto.Qode.values().length)
                ];
        return String.format("%s:%.2f:%s", store ,priceGerado, value);
    }
    public String aplicandoDesconto(Quote quote) {
        delay();
        Double valueComDesconto = quote.getPrice() * (100 - quote.getQode().getPorcentagem()) / 100;
        return String.format("'%s' preco original: '%.2f' desconto aplicado:'%s' preco com desconto:'%.2f'",
                quote.getStore(), quote.getPrice(), quote.getQode(), valueComDesconto);
    }
    private Double geradorPreco() {
        delay();
        return ThreadLocalRandom.current().nextDouble(1, 500) * 10;
    }
    public void shotDown() {
        ex.shutdown();
    }
    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
