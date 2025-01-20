package java_POO.classesInternas.Test;

public class ClassesEstaticasTest01 {
    private String numeroPedido;

    public ClassesEstaticasTest01(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    // Classe aninhada estática para representar o status dos pedidos
    public static class Status {
        public static final String PENDENTE = "Pendente";
        public static final String PROCESSADO = "Processado";
        public static final String ENTREGUE = "Entregue";
    }

    public void imprimirStatus(String status) {
        System.out.println("O pedido " + numeroPedido + " está " + status);
    }
}
class Main {
    public static void main(String[] args) {
        ClassesEstaticasTest01 pedido = new ClassesEstaticasTest01("12345");
        pedido.imprimirStatus(ClassesEstaticasTest01.Status.PENDENTE); // Saída: O pedido 12345 está Pendente
    }
}

