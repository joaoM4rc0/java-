package java_POO.classesInternas.Test;

public class ExternaclassTest02 {
    // Metodo que define uma classe local e a usa
    void print(String nome) {
        // Definição de uma classe local dentro do metodo
        class LocalClass {
            // Metodo da classe local que exibe o nome passado para o metodo print
            public void exibir() {
                System.out.println("seu nome é: " + nome);
            }
        }
        // Instancia a classe local e chama seu metodo exibir
        new LocalClass().exibir();
    }

    public static void main(String[] args) {
        // Cria uma instância da classe externa
        ExternaclassTest02 externaclassTest02 = new ExternaclassTest02();
        // Chama o metodo print da instância da classe externa
        externaclassTest02.print("joao marco");
    }
}
