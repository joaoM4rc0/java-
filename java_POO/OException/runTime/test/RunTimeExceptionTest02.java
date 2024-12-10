package java_POO.OException.runTime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divide(5, 0));
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("NAO É POSSIVEL DIVIDIR POR ZERO");
        }
        return a/b;
    }
}
