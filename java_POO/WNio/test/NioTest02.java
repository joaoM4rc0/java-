package java_POO.WNio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");
        if (Files.notExists(path)) {
            Path directory = Files.createDirectory(path);
        }
        Path paths = Paths.get("pasta/subpasta/subsubpasta");
        Path directories = Files.createDirectories(paths);
        Path filePaths = Paths.get(paths.toString(), "test.txt");
        if (Files.notExists(filePaths)) {
            Path filesPathCreated = Files.createFile(filePaths);
        }
    }
}
