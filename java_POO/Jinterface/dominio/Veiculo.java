package java_POO.Jinterface.dominio;

public interface Veiculo {
    void acelerar();
    void freiar();
    default void buzinar() {
        System.out.println("beep, beep");
    }

}
