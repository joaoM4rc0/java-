package java_POO.MPolimorfismo.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.37;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalculaImposto() {
        System.out.println("calculando o imposto do computador" +
                " ");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
