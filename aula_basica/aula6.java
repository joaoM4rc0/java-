
public class aula6 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        numeros[0] = 10;
        numeros[3] = 55;
        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }
    }
}
