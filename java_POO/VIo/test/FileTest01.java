package java_POO.VIo.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\joaom\\OneDrive\\Documents\\aprendendo_java\\aprendendo\\arquivo\\file.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            if (file.exists()){
                boolean delete = file.delete();
                System.out.println(delete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
