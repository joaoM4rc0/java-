package java_POO.ZGPadoresDeProjeto.dominio;

public interface moeda {
    String getSymbol();
}
class Real implements moeda{

    @Override
    public String getSymbol() {
        return "R$";
    }
}
class UsDollar implements moeda {

    @Override
    public String getSymbol() {
        return "$";
    }
}
