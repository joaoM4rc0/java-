package java_POO.Enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PÉSSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
