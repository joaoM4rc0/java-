package java_POO.classesInternas.Test;

public class ExternaclassTest01 {
    class Inner {
        public void exbir(String nome) {
            System.out.println("esse é o seu nome: " + nome);
        }
    }

    public static void main(String[] args) {
        ExternaclassTest01 externaclassTest01 = new ExternaclassTest01();
        Inner interna = externaclassTest01.new Inner();
        interna.exbir("joao marco");
    }
}
