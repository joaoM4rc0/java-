package gerenciadorDeSeminarios.dominio;

public class Seminario {
    private String titulo;
    private String local;
    private Aluno[] alunos;
    public Seminario(String titulo){
        this.titulo = titulo;
    }
    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime() {
        System.out.println("nome do seminario: " + this.titulo);
        if (alunos == null) {
            System.out.println("nao existe aluno nesse seminario");
            return;
        }
        for (Aluno alunos : alunos) {
            System.out.println("Nome do aluno: " + alunos.getNome());
            System.out.println("idade do aluno: " + alunos.getIdade());
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
