package java_POO.ZEThreads.dominio;

public class Banco {
    private int saldo = 50;

    public void Sacar(int dinheiro) {
        this.saldo = this.saldo - dinheiro;
    }
    public int getSaldo() {
        return saldo;
    }
}
