package java_POO.MPolimorfismo.servico;

import java_POO.MPolimorfismo.dominio.Computador;

public class CalculaImposto {
    public static void CalculaImpostoComputador(Computador computador) {
        System.out.println("Relatorio do computador: ");
        double imposto = computador.CalculaImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("valor: " + computador.getValor());
        System.out.println("imposto a ser pago: " + imposto);
        System.out.println("------------------");
    }
}
