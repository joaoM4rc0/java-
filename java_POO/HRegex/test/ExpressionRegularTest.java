package java_POO.HRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionRegularTest {
    public static void main(String[] args) {
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);

        String text = "exemplo de uso do88 Pattern e 4454matcher exemplo, 22oi, exemplo, 0";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
             System.out.println("Encontrado: '" + matcher.group() + "' começa em " + matcher.start() + " e termina em " + matcher.end());
            };
    }
}
