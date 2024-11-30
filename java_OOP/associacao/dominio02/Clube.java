package java_OOP.associacao.dominio02;

public class Clube {
    private String nome;
    private Jogador[] jogadores;

    public Clube(String nome) {
        this.nome = nome;
    }
    public Clube(String nome, Jogador[] jogador) {
        this.nome = nome; 
        this.jogadores = jogador;
    }
    public void imprime() {
        System.out.println(this.nome);

        if (jogadores == null) return; 

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getName());
        }
    }
    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
