package java_POO.Enumeracao.test;

import java_POO.Enumeracao.dominio.Cliente;
import java_POO.Enumeracao.dominio.Pagamento;
import java_POO.Enumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("guts", TipoCliente.PESSOA_FISICA, Pagamento.CREDITO);
        Cliente cliente2 = new Cliente("caska", TipoCliente.PESSOA_FISICA, Pagamento.DEBITO);
        Cliente cliente3 = new Cliente("naruto", TipoCliente.PÉSSOA_JURIDICA, Pagamento.DEBITO);
        Cliente cliente4 = new Cliente("zoro", TipoCliente.PESSOA_FISICA, Pagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
