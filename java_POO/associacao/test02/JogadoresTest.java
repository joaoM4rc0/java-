package java_POO.associacao.test02;

import java_POO.associacao.dominio02.Clube;
import java_POO.associacao.dominio02.Jogador;

public class JogadoresTest {
    public static void main(String[] args) {
        Clube time = new Clube("corinthians");

        Jogador jogador1 = new Jogador("depay");
        Jogador jogador2 = new Jogador("romero");
        Jogador jogador3 = new Jogador("garro");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Time----");
        time.imprime();
        System.out.println();
        System.out.println("----jogador----");
        jogador1.imprime();
        System.out.println("----jogador----");
        jogador2.imprime();
        System.out.println("----jogador----");
        jogador3.imprime();
        System.out.println("-------------");
    }
}
