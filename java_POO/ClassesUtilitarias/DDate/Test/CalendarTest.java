package  java_POO.ClassesUtilitarias.DDate.Test;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        // Obtém uma instância do Calendar com a data e hora atuais
        Calendar c = Calendar.getInstance();

        // Verifica se o primeiro dia da semana é domingo
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("domingo é o primeiro dia da semana");
        }

        // Imprime o dia da semana atual (1 = domingo, 2 = segunda, etc.)
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        // Imprime o dia do mês atual
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        // Imprime o dia do ano atual
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        // Imprime o índice do dia da semana dentro do mês atual
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        // Imprime a data e hora atuais no formato padrão
        System.out.println("calendario: " + c.getTime());
    }
}
