package java_POO.OException.runTime.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RunTimeExceptionTest03 {
    public static void lerArquivo( String caminho ) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(caminho));
        String linha;

        while ((linha = leitor.readLine()) != null) {
            System.out.println(linha);
        }
        leitor.close();
    }

}

