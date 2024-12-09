package java_POO.MPolimorfismo.test;

import java_POO.MPolimorfismo.Repositorio.JRepositorio;
import java_POO.MPolimorfismo.servico.RepositorioBancoDeDados;

public class repositorioTest {
    public static void main(String[] args) {
        JRepositorio jRepositorio = new RepositorioBancoDeDados();
        jRepositorio.salvar();
    }
}
