package java_OOP.associacao.dominio02;

public class Jogador {
    private String name; 
    private Clube time; 

    public Jogador(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println(this.name);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }
    public Clube getTime() {
        return time;
    }
    public void setTime(Clube time) {
        this.time = time;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
