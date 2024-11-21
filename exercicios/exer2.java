public class exer2 {
    public static void main(String[] args) {
        double salario = 1000;
        double imposto = 0;
        double valorImposto = 0;
        if (salario >= 0 && salario < 34713) {
            imposto = 9.70 / 100;
            valorImposto = salario * imposto;
        }else if (salario >= 34713 && salario < 68508) {
            imposto = 37.65 / 100;
            valorImposto = salario * imposto;
        }else {
            imposto = 49.50 / 100;
            valorImposto = salario * imposto ;
        }
        System.out.println(String.format("O meu salário é de: %.2f R$. O valor de imposto que terei que pagar é %.2f R$.", salario, valorImposto)); 
    }
}