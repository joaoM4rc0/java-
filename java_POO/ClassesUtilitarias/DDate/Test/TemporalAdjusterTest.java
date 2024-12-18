package java_POO.ClassesUtilitarias.DDate.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int tempoParaDiaUtil;
        switch (diaDaSemana) {
            case FRIDAY:
                tempoParaDiaUtil = 3; break;
            case SATURDAY:
                tempoParaDiaUtil = 2; break;
            default:
                tempoParaDiaUtil = 1; break;
        }
        return temporal.plus(tempoParaDiaUtil, ChronoUnit.DAYS);
    }
}
public class TemporalAdjusterTest {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data.getDayOfWeek());
        data = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(data.getDayOfWeek());
    }
}
