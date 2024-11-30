package java_POO.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;
    
    public Escola(String nome) {
        this.nome = nome;
    }
    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professores = professor;
    }

    public void imprime() {
        System.out.println(this.nome);

        if (professores == null) return;

        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
