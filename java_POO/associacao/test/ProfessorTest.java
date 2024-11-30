package java_POO.associacao.test;

import java_POO.associacao.dominio.Escola;
import java_POO.associacao.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("juninho do grau");
        Professor professor2 = new Professor("o brabo");
        Professor professor3 = new Professor("pica de mel");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("colegio 157", professores);
        escola.imprime();
    }
}
