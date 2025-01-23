package java_POO.ZDStream.dominio;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double preco;

    public LightNovel(String title, double preco) {
        this.title = title;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPreco() {
        return preco;
    }
}
