package java_POO.OException.ExceptionTest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        CriaNovoArquivo();
    }
    public static void CriaNovoArquivo() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println("arquivo criado: "+ criado);
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
