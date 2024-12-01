package gerenciadorDeSeminarios.test;

import gerenciadorDeSeminarios.dominio.Aluno;
import gerenciadorDeSeminarios.dominio.Professor;
import gerenciadorDeSeminarios.dominio.Seminario;

public class SeminariosTest {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("joao", 18);
        Aluno aluno02 = new Aluno("marquinho", 18);
        Aluno aluno03 = new Aluno("duda", 18);
        Aluno aluno04 = new Aluno("maisa", 18);

        Aluno[] alunos = {aluno01, aluno02};
        Aluno[] alunos02 = {aluno03, aluno04};
        Aluno[] todosAlunos = {aluno01, aluno02, aluno03, aluno04};

        Professor professor = new Professor("marco");
        String[] especialidades = {"historia"};

        Seminario seminario1 = new Seminario("como luffy se tornarar o rei dos piratas", "uniao sinistra");
        seminario1.setAlunos(alunos);

        Seminario seminario2 = new Seminario("o dia da guerra 2", "parque");
        seminario2.setAlunos(alunos02);

        Seminario[] seminarios = {seminario1, seminario2};

        professor = new Professor("joao" ,especialidades , seminarios);
        professor.setAlunos(todosAlunos);
        aluno01.setSeminario(seminario1);
        aluno02.setSeminario(seminario1);
        aluno03.setSeminario(seminario2);
        aluno04.setSeminario(seminario2);

        System.out.println("---------------");
        professor.imprime();

        System.out.println("-------------");
        seminario1.imprime();

        System.out.println("-------------");
        seminario2.imprime();

        System.out.println("-------------");
        aluno01.imprime();

        System.out.println("-------------");
        aluno02.imprime();

        System.out.println("-------------");
        aluno03.imprime();

        System.out.println("-------------");
        aluno04.imprime();

        System.out.println("-------------");

    }
}
