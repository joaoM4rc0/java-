package java_POO.OException.runTime.dominio;

public class ErroPersonalizado extends Exception{
    public ErroPersonalizado() {
        super("erro de login");
    }
    public ErroPersonalizado(String msg) {
        super(msg);
    }

}
