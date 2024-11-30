package java_OOP.LeituraDoConsole;

import java.util.Scanner;

public class _scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("digite M ou F para seu sexo: ");
        char sexo = scanner.next().charAt(0);
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);

        scanner.close();
    }
}
