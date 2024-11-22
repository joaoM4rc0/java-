public class aula8_2 {
    public static void main(String[] args) {
        int [][][] cubo = {
            {
                {5,8,9},
                {0,55,2},
                {7,2,3}
            },
            {
                {51,82,93},
                {0,55,20},
                {70,24,3}
            },
            {
                {7,9,98},
                {0,559,209},
                {701,243,366}
            }
        };
        for (int i = 0; i < cubo.length; i++){
            for (int j = 0; j < cubo[i].length; j++){
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.println("ELEMENTO EM ["+ i + "][" + j + "][" + k +"]" + cubo[i][j][k]);
                }
            }
        }
    }
}
