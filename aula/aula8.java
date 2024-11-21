public class aula8 {
    public static void main(String[] args) {
        int[][] num = {
            {2,5,40},
            {1,5,45},
            {6,8,40}
        };
        for (int i = 0; i < num.length; i++ ) {
            for (int j = 0; j < num[i].length; j++){
                System.out.println("Elemento em [" + i + "][" + j + "] é: " + num[i][j]);
            }
        }
    }
}
