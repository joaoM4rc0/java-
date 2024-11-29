package java_OOP.associacao.test;

import java_OOP.associacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("neymar");
        Jogador jogador2 = new Jogador("ankara messi ");
        Jogador jogador3 = new Jogador("cr7");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
