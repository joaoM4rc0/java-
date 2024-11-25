package java_OOP.dominio02;

public class Calculadora {
    public void calcula(int[] numeros) {
        int resul = 0;
        for (int num : numeros) {
            resul += num;
        }
        System.out.println(resul);
    }
    public void calculaComVarArgs(double multipllicador, int... numeros) {
        double resul = 0;
        for (int num : numeros) {
            resul += num * multipllicador;
        }
        System.out.println(resul);
    }
}
