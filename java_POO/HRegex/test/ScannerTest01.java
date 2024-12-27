package java_POO.HRegex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "luffy, tanjiro, asta";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
