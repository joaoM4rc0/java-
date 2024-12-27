package java_POO.HRegex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "luffy,tanjiro,asta,true,500";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

    }
}
