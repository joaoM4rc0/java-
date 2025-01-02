package java_POO.WNio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        try {
            Files.createFile(path);
            System.out.println(path.toAbsolutePath());

            String content = "olá";
            Files.write(path, content.getBytes());

            String readContent = new String(Files.readAllBytes(path));
            System.out.println(readContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
