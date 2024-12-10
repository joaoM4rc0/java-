package java_POO.OException.runTime.test;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            int[] numeros = {5,1,2};
            System.out.println(numeros[4]);
            int resul = 10 / 0 ;
            System.out.println(resul);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro no index: " + e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("nao pode dividir por zero erro: " + e.getMessage());
        }finally {
            System.out.println("executando o finally");
        }
    }
}
