package java_OOP.test;

import java_OOP.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("joao marco");
        estudante.setSexo('M');
        estudante.setIdade(18);
        
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Sexo: " + estudante.getSexo());
    }
}
