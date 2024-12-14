package java_POO.ClassesUtilitarias.DFormatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "'Brasil:' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dataFormatada = sdf.format(new Date());
        System.out.println(dataFormatada);
    }
}
