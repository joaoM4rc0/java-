package java_POO.ClassesUtilitarias.SString.test;

public class SStringTest02 {
    public static void main(String[] args) {
        String nome = "      guts        " ;
        for (int i = 0 ; i < nome.length(); i++ ) {
            System.out.println(nome.charAt(i));
        }
        System.out.println(nome.replace("g", "l"));

        System.out.println(nome.substring(0, nome.length()));
        System.out.println(nome.trim());
    }
}
