package java_POO.ZCLambdas.test;

import java.util.function.Predicate;

public class LambdasTest01 {
    public static void main(String[] args) {
        Predicate<Integer> num = numeros -> numeros % 2 ==0 ;
        int numeroParaTest = 6;
        if (num.test(numeroParaTest)) {
            System.out.println(numeroParaTest + " é par");
        }else {
            System.out.println(numeroParaTest + " nao é par");
        }
    }
}
