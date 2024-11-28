package java_OOP.modificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima = 250;
    public static double velocidadeLimite; 
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima; 
    }
    public void imprime() {
        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(Carro.velocidadeLimite);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
