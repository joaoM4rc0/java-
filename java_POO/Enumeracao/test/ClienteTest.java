package java_POO.Enumeracao.test;

import java_POO.Enumeracao.dominio.Cliente;
import java_POO.Enumeracao.dominio.Pagamento;
import java_POO.Enumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente02 = new Cliente("guts", TipoCliente.PESSOA_FISICA, Pagamento.CREDITO, 100);
        double desconto = cliente02.CalcularDesconto(cliente02.getValorCompra());
        System.out.println(cliente02);
    }
}



