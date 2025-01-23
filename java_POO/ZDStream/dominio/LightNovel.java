package java_POO.ZDStream.dominio;

public class LightNovel {
    private String title;
    private double preco;

    public LightNovel(String title, double preco) {
        this.title = title;
        this.preco = preco;
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
