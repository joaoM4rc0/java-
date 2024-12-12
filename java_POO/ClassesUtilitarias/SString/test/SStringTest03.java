package java_POO.ClassesUtilitarias.SString.test;

public class SStringTest03{
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo que levou para executar: " + (fim - inicio) + "ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBulder(1000000);
        long fim2 = System.currentTimeMillis();
        System.out.println("tempo que levou para executar o StringBulder: " + (fim2 - inicio2) + "ms");
    }
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
    private static void concatStringBulder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
