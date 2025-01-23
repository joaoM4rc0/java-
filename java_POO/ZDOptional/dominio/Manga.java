package java_POO.ZDOptional.dominio;

public class Manga {
    private Integer id;
    private int caps;
    private String name;

    public Manga(String name, Integer id, int caps) {
        this.name = name;
        this.id = id;
        this.caps = caps;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", caps=" + caps +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public int getCaps() {
        return caps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }
}
