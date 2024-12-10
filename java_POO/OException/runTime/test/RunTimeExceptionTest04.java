package java_POO.OException.runTime.test;


import java.io.IOException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            System.out.println("abrindo um arquivo");
            throw new IOException("erro ao abrir o arquivo");
//            System.out.println("escrevendo no arquivo");
        }catch (IOException e){
            System.out.println("ops, teve um erro: " + e.getMessage());
        }finally {
            System.out.println("fechando o arquivo");
        }
    }
}
