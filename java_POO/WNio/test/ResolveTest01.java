package java_POO.WNio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/joao/");
        Path arquivo = Paths.get("text/texto.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
    }
}
