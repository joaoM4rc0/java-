package java_POO.ZFConcorrencia.dominio;

public class Quote {
    private final String store;
    private final Double price;
    private final Desconto.Qode qode;

    private Quote(String store, Double price, Desconto.Qode qode) {
        this.store = store;
        this.price = price;
        this.qode = qode;
    }

    /**
     *
     * @param value vai ser um String de store, um double de preco e um desconto
     * @return a propria classe usando seu construtor com os valores de
     * um split de value
     */
    public static Quote newQoate(String value) {
        String[] values = value.split(":");
        String priceStr = values[1].replace(",", ".");
        return new Quote(values[0], Double.valueOf(priceStr), Desconto.Qode.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", qode=" + qode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public Desconto.Qode getQode() {
        return qode;
    }

    public Double getPrice() {
        return price;
    }
}
