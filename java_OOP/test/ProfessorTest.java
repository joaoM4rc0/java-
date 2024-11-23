package java_OOP.test;

import java_OOP.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setIdade(49);
        professor.setSexo('m');
        professor.setNome("joao");

        System.out.println(professor.getNome());
    }
}