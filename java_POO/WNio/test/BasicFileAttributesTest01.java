package java_POO.WNio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime data = LocalDateTime.now().minusDays(1);
        Path path = Paths.get("Pasta/texto02.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(data.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
    }
}
