package PolimorfismoExer.dominio;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String movimento() {
        return "cachorro está se movimentando ";
    }

    @Override
    public String som() {
        return "o cachorro está latindo: AU AU AU";
    }

}
