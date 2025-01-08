package java_POO.Wcolecoes.Equals.test;

//import java_POO.Wcolecoes.Equals.dominio.SmartPhone01;
import java_POO.Wcolecoes.Equals.dominio.SmartPhone02;

public class SmartPhoneTest02 {
    public static void main(String[] args) {
        SmartPhone02 s1 = new SmartPhone02("54gh8", "xiamoi");
        SmartPhone02 s2 = new SmartPhone02("54gh8", "samsung");
        System.out.println(s1.equals(s2));
    }
}
