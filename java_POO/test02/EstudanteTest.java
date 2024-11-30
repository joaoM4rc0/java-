package java_POO.test02;

import java_POO.dominio02.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.nome = "zoro";
        estudante.idade = 23;
        estudante.sexo = 'm';

        estudante02.nome = "Nami";
        estudante02.idade = 22;
        estudante02.sexo = 'F';


        estudante.Imprime();
        System.out.println("-----------------------------------");
        estudante02.Imprime();
    }
}
