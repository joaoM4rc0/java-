package dominio;

public class Funcionarios {
    public String nome; 
    public int idade; 
    public double[] salario;
    private double salarioSomado;
    public void somaSalarioT() {
        if (salario == null || salario.length == 0) {
            System.out.println("Erro: Salário não disponível."); 
            return;
        } 
        salarioSomado = 0;
        for (double d : salario) {
            salarioSomado += d;           
        }
    }
    public void ImprimeDados() {
        somaSalarioT();
        System.out.println("nome: " + this.nome + ", idade: " + this.idade + " e esse é o meu salario: " + this.salarioSomado +"R$");
    }
    public void mediaSalarial(double... salario) {
        if (salario == null || salario.length == 0) {
            System.out.println("Erro: Nenhum salário fornecido.");
            return; 
        }
        double somaSalario = 0;
        for (double d : salario) {
            somaSalario += d;
        }
        double mediaDoSalario = somaSalario / salario.length;
        System.out.println("media salarial: " + mediaDoSalario + "R$");
    }
}
