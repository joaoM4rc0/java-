package java_POO.MPolimorfismo.dominio;

public abstract class Protudo implements Imposto {
    protected String nome;
    protected double valor;

    public Protudo(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
