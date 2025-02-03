package java_POO.ZFConcorrencia.dominio;

public class Desconto {
    public enum Qode {
        NONE(0), SUPER_SAYAJIN(10), SUPER_SAYAJIN_2(15);
        private final int porcentagem;

        Qode(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }

}
