package java_POO.Hheranca.test;

import java_POO.Hheranca.dominio.Endereco;
import java_POO.Hheranca.dominio.Funcionario;

public class HherancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("52364-000");
        endereco.setRua("rua das paixões");
        Funcionario funcionario = new Funcionario("inuyasha");
        funcionario.setSalario(18000);
        funcionario.setCpf("188-161-174-01");
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
