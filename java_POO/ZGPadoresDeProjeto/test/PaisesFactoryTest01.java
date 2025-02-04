package java_POO.ZGPadoresDeProjeto.test;

import java_POO.ZGPadoresDeProjeto.dominio.Paises;
import java_POO.ZGPadoresDeProjeto.dominio.PaisesFactory;
import java_POO.ZGPadoresDeProjeto.dominio.moeda;

public class PaisesFactoryTest01 {
    public static void main(String[] args) {
        moeda moeda = PaisesFactory.newMoeda(Paises.BRAZIL);
        System.out.println(moeda.getSymbol());
    }
}
