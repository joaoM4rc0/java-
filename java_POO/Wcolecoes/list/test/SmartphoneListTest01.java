package java_POO.Wcolecoes.list.test;
import java_POO.Wcolecoes.Equals.dominio.SmartPhone02;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        SmartPhone02 s1 = new SmartPhone02("xiaomi", "5f5e852");
        SmartPhone02 s2 = new SmartPhone02("samsung", "5f5e852");

        List<SmartPhone02> celulares = new ArrayList<>();
        celulares.add(s1);
        celulares.add(s2);
        for (SmartPhone02 celular : celulares) {
            System.out.println(celular);
        }
    }

}
