package java_POO.LeituraDoConsole.exercicios;

import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("vou prever tudo");
        while(true) {
            System.out.println("deixe sua pergunta e responderei com sim ou não: ");
            String pergunta = input.nextLine();

            if(pergunta.charAt(0) == ' ') {
                System.out.println("sim");
            }else {
                System.out.println("não");
            }

        }

    }
}
