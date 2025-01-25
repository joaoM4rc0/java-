package java_POO.ZDStream.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;


public class StreamTest09 {
    public static void main(String[] args) {
        Stream.iterate(1,n -> n + n)
                .limit(20)
                .forEach(System.out::println);
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);
    }
}
