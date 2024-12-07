package java_POO.ClassesAbstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        CalculaBonus();
    }
    public abstract void CalculaBonus();
}
