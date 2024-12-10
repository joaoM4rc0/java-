package PolimorfismoExer.dominio;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String movimento() {
        return "o gato está se movimentando ";
    }
    @Override
    public String som() {
        return "o gato está miando: MIAU MIAU";
    }
}
