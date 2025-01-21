package java_POO.ZCLambdas.dominio;

public class Anime {
    private String name;
    private int eps;

    public Anime(String name, int eps) {
        this.name = name;
        this.eps = eps;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", eps=" + eps +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getEps() {
        return eps;
    }
}
