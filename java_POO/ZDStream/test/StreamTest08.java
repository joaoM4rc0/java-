package java_POO.ZDStream.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamTest08 {
    public static void main(String[] args) {
        try(Stream<String> fileStream = Files.lines(Paths.get("file.txt"))){
            fileStream.filter(fs -> fs.contains("melhor")).forEach(System.out::println);
        }catch (IOException e) {
            System.out.println(" " + e);
        }
    }
}

/*
retorna:
Neymar é o melhor jogador do futebol brasileiro
o melhor anime é hajime no ippo
melhor
 */