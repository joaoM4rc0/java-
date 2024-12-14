package java_POO.ClassesUtilitarias.DFormatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localBrasil = new Locale("pt", "BR");
        Locale localJapan = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[2];
        nfa[0] = NumberFormat.getCurrencyInstance(localBrasil);
        nfa[1] = NumberFormat.getCurrencyInstance(localJapan);
        double valor = 10_000.2456;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
    }
}
