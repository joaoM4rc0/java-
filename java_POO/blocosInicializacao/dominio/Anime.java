package java_POO.blocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] eps;
    {
        eps = new int[100]; 
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {
        for (int i : eps) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }
    public int[] getEps() {
        return eps;
    }
}
