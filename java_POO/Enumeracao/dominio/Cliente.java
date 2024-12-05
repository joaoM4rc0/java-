package java_POO.Enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private Pagamento pagamento;
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, Pagamento pagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.VALOR +
                ", pagamento=" + pagamento +
                '}';
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
