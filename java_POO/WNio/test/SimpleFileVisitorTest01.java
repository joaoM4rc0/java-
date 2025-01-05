package java_POO.WNio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//class ListAllFiles extends SimpleFileVisitor<Path> {
//    @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
//        String regex = "\\w\\.java";
//        String fileName = String.valueOf(file.getFileName());
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(fileName);
//        if (matcher.find()) {
//            System.out.println(fileName);
//        }
//        return FileVisitResult.CONTINUE;
//    }
//}
class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().matches("(.)+\\.(java)")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class SimpleFileVisitorTest01 {
    public static void main(String[] args) {
        Path root = Paths.get(".");
        try {
            Path path = Files.walkFileTree(root, new ListAllFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
