package java_POO.blocoInicializacaoEstatico.dominio;

public class Anime {
        private String nome;
        private static int[] eps;
        static {
            System.err.println("no bloco estático");
            eps = new int[100]; 
            for (int i = 0; i < eps.length; i++) {
                eps[i] = i + 1;
            }
        }
         {
            System.err.println("no bloco não estático");
        }
        public Anime(String nome) {
            this.nome = nome;
        }
        public Anime() {
            for (int i : eps) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        public String getNome() {
            return nome;
        }
        public int[] getEps() {
            return eps;
        }
    }
