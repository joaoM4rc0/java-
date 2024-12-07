package java_POO.Jinterface.dominio;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("o carro está acelerando");
    }

    @Override
    public void freiar() {
        System.out.println("o carro está freiando");
    }
}
