package java_POO.OException.runTime.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RunTimeExceptionTest06 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("arquivo,txt"))) {

        }catch (IOException e ) {
            System.out.println("erro: " + e.getMessage());
        }
    }
    // o codigo acima é claramente mais limpo
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("arquivo.txt"));
        }catch (IOException e ){
            System.out.println("erro: " + e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
