package java_POO.Wcolecoes.list.dominio;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private long id;
    private String nome;
    private double preco;

    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(nome, "nome nao pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(preco, manga.preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
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

    @Override
    public int compareTo(@NotNull  Manga outroManga) {
        return Long.compare(this.id, outroManga.getId());
    }
}
