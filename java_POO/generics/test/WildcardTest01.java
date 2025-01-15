package java_POO.generics.test;


public class WildcardTest01 {
    public static void main(String[] args) {
       Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
       Gato[] gatos = {new Gato(), new Gato()};
       printConsulta(cachorros);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal: animals) {
            animal.consulta();
        }
    }
}
