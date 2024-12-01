package gerenciadorDeSeminarios.test;

import gerenciadorDeSeminarios.dominio.Aluno;
import gerenciadorDeSeminarios.dominio.Professor;
import gerenciadorDeSeminarios.dominio.Seminario;

public class SeminariosTest {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("joao", 18);
        Professor professor = new Professor("marco");
        String[] especialidades = {"historia"};

        Seminario seminario1 = new Seminario("como luffy se tornarar o rei dos piratas", "uniao sinistra");
        Seminario seminario2 = new Seminario("o dia da guerra 2", "parque");
        Seminario[] seminarios = {seminario1, seminario2};

        professor = new Professor("joao" ,especialidades , seminarios);
        aluno01.setSeminario(seminario1);
        professor.imprime();
    }
}
