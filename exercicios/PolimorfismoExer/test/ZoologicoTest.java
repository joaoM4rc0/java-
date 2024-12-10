package PolimorfismoExer.test;

import PolimorfismoExer.dominio.Animal;
import PolimorfismoExer.dominio.Cachorro;
import PolimorfismoExer.dominio.Gato;
import PolimorfismoExer.servico.Zoologico;

public class ZoologicoTest {
    public static void main(String[] args) {
        Animal animal = new Cachorro("marisclaide");
        Animal animal02 = new Cachorro("thor");
        Animal animal03 = new Cachorro("belinha");

        Animal animal04 = new Gato("bills");
        Animal animal05 = new Gato("pichani");
        Animal animal06 = new Gato("pog");
        Animal[] animais = {animal, animal02, animal03, animal04, animal05, animal06};

        Zoologico zoologico = new Zoologico();
        zoologico.setAnimais(animais);
        zoologico.getAnimais();
        zoologico.exibeMovimentoDosAnimais(animal02);
        zoologico.exibeSonsDosAnimais(animal);
    }
}
