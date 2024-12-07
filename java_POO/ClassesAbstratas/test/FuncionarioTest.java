package java_POO.ClassesAbstratas.test;

import java_POO.ClassesAbstratas.dominio.Dev;
import java_POO.ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Dev dev = new Dev("okarun", 1500);
        Gerente gerente = new Gerente("ayase", 8000);

        System.out.println(dev);
        System.out.println(gerente);
    }
}
