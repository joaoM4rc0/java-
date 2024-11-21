public class aula5 {
    public static void main(String[] args) {
        int num;
        for (int i=0; i <= 100; i++) {
            if (i % 2 == 0) {
                num = i;
                System.out.println(num + " é par");
            }else {
                num = i;
                System.out.println(num + " é impar");
            }
        }
    }
}
