package java_POO.OException.runTime.test;

import java.io.IOException;

public class TestDoRun03 {
    public static void main(String[] args) {
        try {
            RunTimeExceptionTest03.lerArquivo("caminho/para/arquivo.txt");
        }catch (IOException e) {
            System.out.println("erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
