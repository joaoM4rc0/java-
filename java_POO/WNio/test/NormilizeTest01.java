package java_POO.WNio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormilizeTest01 {
    public static void main(String[] args){
        String caminho = "home/joao/text";
        String arquivoTxt = ";;/;;/texto.txt";

        Path path1 = Paths.get(caminho, arquivoTxt);
        System.out.println(path1);
    }
}
