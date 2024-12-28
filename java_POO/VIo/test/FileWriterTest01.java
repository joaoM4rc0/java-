package java_POO.VIo.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("o melhor mangá do mundo é berserk");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
