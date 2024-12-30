package java_POO.VIo.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file02.txt");

        try(FileWriter fw = new FileWriter(file)) {
            BufferedWriter br = new BufferedWriter(fw);
            br.write("olá");
            br.flush();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
