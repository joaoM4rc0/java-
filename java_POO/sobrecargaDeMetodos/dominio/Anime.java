package java_POO.sobrecargaDeMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    //alteração que me forçou a usar a sobrecarga de metodos:
    private String genero;

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero) {
        init(nome, tipo, episodios);
        this.genero = genero;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

}
