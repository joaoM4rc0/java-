package java_POO.WNio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta/oi.txt");
        Path path2 = Paths.get("pasta/subpasta/subsubpasta/oi.bkg");
        Path path3 = Paths.get("pasta/subpasta/subsubpasta/oi.java");

        matches(path1, "glob:**.{txt,java,bkg}");
        matches(path2, "glob:**.{txt,java,bkg}");
        matches(path3, "glob:**.{txt,java,bkg}");
        matches(path3, "glob:**/*.????");
        matches(path3, "glob:**/oi.????");
    }
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
