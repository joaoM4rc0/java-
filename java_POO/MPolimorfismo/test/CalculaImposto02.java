package java_POO.MPolimorfismo.test;

import java_POO.MPolimorfismo.dominio.Computador;
import java_POO.MPolimorfismo.dominio.Produto;
import java_POO.MPolimorfismo.dominio.Televisao;
import java_POO.MPolimorfismo.servico.CalculaImposto;

public class CalculaImposto02 {
    public static void main(String[] args) {
        Produto produto = new Computador("nitro 5 ", 4500);
        Produto produto2 = new Televisao("Sansung v9", 6000);
        CalculaImposto.CalculaImpostoProduto(produto);
        CalculaImposto.CalculaImpostoProduto(produto2);
    }
}
