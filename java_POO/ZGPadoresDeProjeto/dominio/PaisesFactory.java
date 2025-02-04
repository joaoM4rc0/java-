package java_POO.ZGPadoresDeProjeto.dominio;


public class PaisesFactory {
    public static moeda newMoeda(Paises pais) {
        switch (pais) {
            case USA:return new UsDollar();
            case BRAZIL: return new Real();
            default:
                throw new IllegalArgumentException("nao temos moeda para esse pais");
        }
    }
}
