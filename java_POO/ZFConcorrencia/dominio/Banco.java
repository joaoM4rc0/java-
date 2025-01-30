package java_POO.ZFConcorrencia.dominio;

public class Banco {
    private int saldo = 50;

    public void Sacar(int dinheiro) {
        this.saldo = this.saldo - dinheiro;
    }
    public int getSaldo() {
        return saldo;
    }
}
