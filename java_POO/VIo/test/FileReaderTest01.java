package java_POO.VIo.test;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)) {

            int i;
            while ((i=fr.read())!= -1) {
                System.out.print((char) i);
            }
//            char[] in = new char[50];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
        } catch (IOException e ) {
            throw new RuntimeException(e);
        }
    }
}
