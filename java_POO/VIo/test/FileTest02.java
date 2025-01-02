package java_POO.VIo.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File filePasta = new File("arquivo");
        boolean isPaastaCreated = filePasta.mkdir();
        System.out.println(isPaastaCreated);

        File fileArquivo = new File(filePasta, "file.txt");
        boolean isArquivoCreated = fileArquivo.createNewFile();
        System.out.println(isArquivoCreated);

        File fileRenamed = new File(filePasta, "arquivo_renomeado.txt");
        boolean isRenamedArquivo = fileArquivo.renameTo(fileRenamed);
        System.out.println(isRenamedArquivo);
    }
}
