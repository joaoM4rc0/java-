
package java_POO.MPolimorfismo.servico;

import java_POO.MPolimorfismo.dominio.Produto;
import java_POO.MPolimorfismo.dominio.Televisao;

public class CalculaImposto {
    public static void CalculaImpostoProduto(Produto produto) {
        System.out.println("Relatorio do produto: ");

        double imposto = produto.CalculaImposto();

        System.out.println( "nome do produto: " + produto.getNome());
        System.out.println("valor: " + produto.getValor());
        System.out.println("imposto a ser pago: " + imposto);

        if(produto instanceof Televisao) {
            Televisao televisao = (Televisao) produto;
            System.out.println(televisao.getControle());
        }
    }
}
