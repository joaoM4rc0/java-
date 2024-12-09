package java_POO.MPolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.20;
    private String controle = "controle c4";
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalculaImposto() {
        System.out.println("calculando o imposto da TV" );
        return this.valor * IMPOSTO_POR_CENTO;
    }


    @Override
    public String toString() {
        return "Televisao{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
    public String getControle() {
        return controle;
    }
}
