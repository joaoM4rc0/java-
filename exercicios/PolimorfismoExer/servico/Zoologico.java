package PolimorfismoExer.servico;

import PolimorfismoExer.dominio.Animal;

import java.util.Arrays;

public class Zoologico {
    private Animal[] animais;

    public void exibeSonsDosAnimais(Animal animal){
        String sons = animal.som();
        System.out.println(animal.getNome() + ": " + sons);
    }
    public void exibeMovimentoDosAnimais(Animal animal){
        String movimento = animal.movimento();
        System.out.println(animal.getNome() + ": " + movimento);
    }
    public Animal[] getAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNome());
        }
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }
}
