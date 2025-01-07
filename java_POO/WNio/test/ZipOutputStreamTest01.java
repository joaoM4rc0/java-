package java_POO.WNio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivoParaZipar = Paths.get("pasta/subpasta/subsubpasta");
        zip(arquivoZip, arquivoParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivoParaZipar) {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)) {
            for(Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
            }
        }catch (IOException e) {
            System.out.println(" " + e);
        }
    }
}
