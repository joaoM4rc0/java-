package java_POO.OException.runTime.test;

public class RunTimeExceptionTest05 {
        public static void main(String[] args) {
            try {
                int[] arr = new int[2];
                System.out.println(arr[5]); // Lança ArrayIndexOutOfBoundsException
                int result = 10 / 0; // Lança ArithmeticException
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
                System.out.println("Erro específico: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro genérico: " + e.getMessage());
            } finally {
                System.out.println("Bloco finally executado.");
            }
        }
}
