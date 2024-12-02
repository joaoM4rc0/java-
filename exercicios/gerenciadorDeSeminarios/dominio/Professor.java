package gerenciadorDeSeminarios.dominio;

public class Professor {
    private String nome;
    private String[] especialidade;
    private Seminario[] seminarios;
    private Aluno[] alunos;

    // Construtores
    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String[] especialidades) {
        this(nome); // Chama o construtor principal
        this.especialidade = especialidades;
    }

    public Professor(String nome, String[] especialidade, Seminario[] seminarios) {
        this(nome, especialidade); // Chama o segundo construtor
        this.seminarios = seminarios;
    }

    // Métodos de impressão
    public void imprime() {
        System.out.println("Nome do professor: " + this.nome);

        if (especialidade == null || especialidade.length == 0) {
            System.out.println("O professor deve ter alguma especialidade.");
        } else {
            System.out.println("Especializações do professor: " + String.join(", ", especialidade));
        }

        if (seminarios == null || seminarios.length == 0) {
            System.out.println("Nenhum seminário registrado.");
        } else {
            System.out.println("Seminários:");
            for (Seminario seminario : seminarios) {
                System.out.println(" - " + seminario.getTitulo());
            }
        }

        if (alunos == null || alunos.length == 0) {
            System.out.println("O professor não tem nenhum aluno.");
        } else {
            System.out.println("Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(" - " + aluno.getNome());
            }
        }
    }

    // Getters e setters
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
