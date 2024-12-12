package java_POO.OException.runTime.test;

import java_POO.OException.runTime.dominio.ErroPersonalizado;

public class ErroPersonalizadoTest {
    public static void main(String[] args) {
        try {
            executaAlugmaCoisa();
        }catch (ErroPersonalizado e) {
            System.out.println("aconteceu esse erro: " + e );
        }
    }
    public static void executaAlugmaCoisa() throws ErroPersonalizado {
        boolean condicaoDeErro = true;

        if (condicaoDeErro) {
            throw new ErroPersonalizado("erro na conexao ");
        }
        System.out.println("deu tudo certo sem erros");
    }
}
