
package java_POO.MPolimorfismo.servico;

import java_POO.MPolimorfismo.dominio.Computador;
import java_POO.MPolimorfismo.dominio.Produto;

public class CalculaImposto {
    public static void CalculaImpostoProduto(Produto produto) {
        System.out.println("Relatorio do produto: ");
        double imposto = produto.CalculaImposto();
        System.out.println( "nome do produto: " + produto.getNome());
        System.out.println("valor: " + produto.getValor());
        System.out.println("imposto a ser pago: " + imposto);
        System.out.println("------------------");
    }
}
