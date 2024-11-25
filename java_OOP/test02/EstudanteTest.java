package java_OOP.test02;

import java_OOP.dominio02.Estudante;
import java_OOP.dominio02.ImprimeEstudante;

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

        ImprimeEstudante impressora = new ImprimeEstudante();

        impressora.Imprime(estudante);
        System.out.println("-----------------------------------");
        impressora.Imprime(estudante02);
    }
}
