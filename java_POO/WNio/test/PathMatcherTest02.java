package java_POO.WNio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles02 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        matches(file, "glob:**/*Test*.{java,class}");
        return FileVisitResult.CONTINUE;
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        if(matcher.matches(path) ) {
            System.out.println(path.getFileName());
        }
    }
}
public class PathMatcherTest02 {
    public static void main(String[] args) {
        Path root = Paths.get(".");
        try {
            Files.walkFileTree(root, new ListAllFiles02());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
