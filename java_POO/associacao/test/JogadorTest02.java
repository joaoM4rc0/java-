package java_POO.associacao.test;

import java_POO.associacao.dominio.Jogador;
import java_POO.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("depay");
        Time time = new Time("corinthians");

        jogador.setTime(time);
        jogador.imprime();
    }
}
