package java_POO.classesInternas.Test;


class Animal {
    public void andar() {
        System.out.println("o animal está andando");
    }
}
public class ClassesAnonimasTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void andar() {
                System.out.println("vai se fuder");
            }
        };
        animal.andar();
    }
}
