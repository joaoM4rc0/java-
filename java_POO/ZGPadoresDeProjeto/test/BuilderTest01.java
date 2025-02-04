package java_POO.ZGPadoresDeProjeto.test;

import java_POO.ZGPadoresDeProjeto.dominio.Person;

public class BuilderTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("joao")
                .lastName("marco")
                .age(19)
                .email("joaomarco@gmail.com")
                        .build();
        System.out.println(person);
    }

}
