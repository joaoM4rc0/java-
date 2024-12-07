package java_POO.Jinterface.dominio02;

public class MetodoC implements A, B{
    @Override
    public void metodoA() {
        System.out.println("A");
    }

    @Override
    public void metodoB() {
        System.out.println("b");
    }
}
