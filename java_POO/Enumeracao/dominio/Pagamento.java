package java_POO.Enumeracao.dominio;

public enum Pagamento {
    DEBITO {
        @Override
        public double CalculaDesconto(double valor) {
            return valor * 0.08;
        }
    },
    CREDITO {
        @Override
        public double CalculaDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double CalculaDesconto(double valor);
}
