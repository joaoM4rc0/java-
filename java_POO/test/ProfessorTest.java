package java_POO.test;

import java_POO.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setIdade(49);
        professor.setSexo('m');
        professor.setNome("joao");

        System.out.println(professor.getNome());
    }
}