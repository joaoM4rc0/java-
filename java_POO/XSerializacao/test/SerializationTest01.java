package java_POO.XSerializacao.test;

import java_POO.XSerializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "zoro", "Z_ORO08!");
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/subpasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            System.out.println(" " + e);

        }
    }
    private static void deserializar() {
        Path path = Paths.get("pasta/subpasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}