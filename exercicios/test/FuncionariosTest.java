package test;

import dominio.Funcionarios;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();

        funcionarios.nome = "joao";
        funcionarios.idade = 18;
        funcionarios.salario = new double[]{1000, 2000, 3000};
        
        funcionarios.ImprimeDados();
        System.out.println("------------------");
        funcionarios.mediaSalarial(funcionarios.salario);
    }
}
