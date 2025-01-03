package java_POO.WNio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path absolute1 = Paths.get("/home/dev");
        Path absolute2 = Paths.get("/home/dev/texto/arquivo.text");
        Path absolute3 = Paths.get("/urs/local");
        Path relativo1 = Paths.get("data/");
        Path relativo2 = Paths.get("data/Date.java");

        System.out.println("1 " + absolute1.relativize(absolute2));
        System.out.println("2 " + absolute2.relativize(absolute1));
        System.out.println("3 " + absolute3.relativize(absolute1));
        System.out.println("4 " + relativo1.relativize(relativo2));
    }
}
