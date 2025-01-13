package java_POO.Wcolecoes.list.dominio;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private long id;
    private String nome;
    private double preco;
    private int quantidade;
    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(nome, "nome nao pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(@NotNull  Manga outroManga) {
        return this.nome.compareTo(outroManga.getNome());
//        return Double.compare(this.preco, outroManga.getPreco());
//        return Double.valueOf(this.preco).compareTo(outroManga.getPreco());
//        return Long.compare(this.id, outroManga.getId());
    }
}
