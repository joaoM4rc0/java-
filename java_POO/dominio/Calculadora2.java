package java_POO.dominio;

public class Calculadora2 {
    private int resultado;
    public void calculaNumeros(int num1, int num2, char operador) {
            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '/': 
                    if (num2 ==0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        break;
                    }
                    resultado = num1 / num2;
                    break;
                case '*': 
                    resultado = num1 * num2;
                    break;
                default: 
                    System.out.println("operador invalido!!!");
                    break;
            }
        System.out.println("resultado: " + resultado);
        }
}
