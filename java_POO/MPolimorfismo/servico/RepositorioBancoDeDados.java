package java_POO.MPolimorfismo.servico;

import java_POO.MPolimorfismo.Repositorio.JRepositorio;

public class RepositorioBancoDeDados implements JRepositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
