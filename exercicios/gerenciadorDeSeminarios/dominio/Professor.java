package gerenciadorDeSeminarios.dominio;

public class Professor {
    private String nome;
    private String[] especialidade;
    private Seminario[] seminarios;
    private Aluno[] alunos;

    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, String[] especialiades) {
        this.nome = nome;
        this.especialidade = especialiades;
    }

    public Professor(String nome, String[] especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void  imprime(){
        System.out.println("nome do professor: " + this.nome);

        if (especialidade == null) {
            System.out.println("o professor tem que ter alguma especialidade");
            return;
        }
        for (String especializacao: especialidade) {
            System.out.println("especializacao do professor: " + especializacao);
        }
        if (seminarios == null) {
            System.out.println("nao tem nenhum seminario");
            return;
        }
        for (Seminario seminario : seminarios) {
            System.out.println("seminarios: " + seminario.getTitulo());
        }
        if (alunos == null) {
            System.out.println("O professor nao tem nenhum aluno!!");
            return;
        }
        for (Aluno aluno : alunos) {
            System.out.println("nome dos alunos: " + aluno.getNome() );
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String[] especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
