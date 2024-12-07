package java_POO.ClassesAbstratas.dominio;

public class Dev extends Funcionario{
    public Dev(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
