package java_POO.VIo.test;


import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file02.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
