package java_POO.Enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private Pagamento pagamento;
    public double ValorCompra;
    public Cliente(String nome, TipoCliente tipoCliente, Pagamento pagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.pagamento = pagamento;
    }

    public Cliente(String nome, TipoCliente tipoCliente, Pagamento pagamento, double valorCompra) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.pagamento = pagamento;
        this.ValorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.VALOR +
                ", pagamento=" + pagamento +
                ", valor da compra=" + getValorCompra() +
                ", desconto=" + CalcularDesconto(this.ValorCompra)+
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
    public double CalcularDesconto(double valor){
        return pagamento.CalculaDesconto(valor);
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.ValorCompra = valorCompra;
    }
}
