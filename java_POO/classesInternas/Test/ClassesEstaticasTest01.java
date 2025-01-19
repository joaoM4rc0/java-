package java_POO.classesInternas.Test;

class Externa {
    private static String mensagem = "olá estou no metodo interno";
    public static class AnhinhadaEstatica {
        public void exibir() {
            System.out.println(mensagem);
        }
    }
}
public class ClassesEstaticasTest01 {
    public static void main(String[] args) {
        Externa.AnhinhadaEstatica anhinhadaEstatica = new Externa.AnhinhadaEstatica();
        anhinhadaEstatica.exibir();
    }

}
