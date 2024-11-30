package java_POO.test02;

import java_POO.dominio02.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(18);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
