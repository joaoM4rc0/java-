package java_POO.generics.test;

abstract class Animal {
    public abstract void consulta();
}
class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando cachorro");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}
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
