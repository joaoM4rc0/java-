package java_POO.ClassesUtilitarias.SString.test;

public class SStringTest {
    public static void main(String[] args) {

    }
    private static boolean isEmptyOrNull(String nome) {
        return nome == null || nome.isEmpty();
    }
    private static String reverse(String nome) {
        if (nome.isEmpty() || nome == null) {
            return null;
        }
        return new StringBuilder(nome).reverse().toString();
    }
}
