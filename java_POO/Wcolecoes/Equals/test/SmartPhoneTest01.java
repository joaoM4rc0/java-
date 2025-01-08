package java_POO.Wcolecoes.Equals.test;

import java_POO.Wcolecoes.Equals.dominio.SmartPhone01;

public class SmartPhoneTest01 {
    public static void main(String[] args) {
        SmartPhone01 s1 = new SmartPhone01("54gh8", "xiamoi");
        SmartPhone01 s2 = new SmartPhone01("54gh8", "xiamoi");
        System.out.println(s1.equals(s2));
    }
}
