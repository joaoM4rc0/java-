import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class SimpleFileVisitorTest02 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("Visited file: " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("About to visit directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("Visited directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println("Failed to visit file: " + file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) {
        Path startPath = Paths.get("/path/to/start");

        SimpleFileVisitorTest02 visitor = new SimpleFileVisitorTest02();
        try {
            Files.walkFileTree(startPath, visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
