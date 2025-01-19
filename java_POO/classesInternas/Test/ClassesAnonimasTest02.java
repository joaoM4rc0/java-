package java_POO.classesInternas.Test;

import java_POO.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("lancha"));
        barcos.add(new Barco("canoa"));
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcos);
    }
}
