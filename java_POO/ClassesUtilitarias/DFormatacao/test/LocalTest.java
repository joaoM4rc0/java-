package java_POO.ClassesUtilitarias.DFormatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest {
    public static void main(String[] args) {
        // Cria objetos Locale para Itália e Japão
        Locale localItaly = new Locale("it", "IT");
        Locale localJapao = new Locale("ja", "JP");

        // Obtém a data e hora atuais
        Calendar calendar = Calendar.getInstance();

        // Obtém instâncias de DateFormat com estilo FULL para Itália e Japão
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);

        // Imprime a data formatada para cada localidade
        System.out.println("data na Itália: " + df.format(calendar.getTime()));
        System.out.println("data no Japão: " + df2.format(calendar.getTime()));
    }
}

