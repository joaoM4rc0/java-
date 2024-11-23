public class exer4 {
    public static void main(String[] args) {
        int [][] matriz = {{5,8,9},{4,1,2}};
        int [][] matriz2= {{1,0,9},{3,10,2}};
        int [][] somaMatriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaMatriz[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < somaMatriz.length;i++){
            for (int j = 0; j < somaMatriz[i].length; j++) {
                System.out.println(somaMatriz[i][j]);
            }
        }
    }
}
