package java_POO.Enumeracao.test02;

import java_POO.Enumeracao.dominio02.TipoCliente;

public class TipoClienteTest {
    public static void main(String[] args) {
        try {
            TipoCliente tipo1 = TipoCliente.buscarPorCodigo(1);
            System.out.println("Encontrado: " + tipo1.getDescricao());

            TipoCliente tipo2 = TipoCliente.buscarPorCodigo(2);
            System.out.println("Encontrado: " + tipo2.getDescricao());

            // Este lançará uma exceção
            TipoCliente tipoInvalido = TipoCliente.buscarPorCodigo(99);
            System.out.println("Encontrado: " + tipoInvalido.getDescricao());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

