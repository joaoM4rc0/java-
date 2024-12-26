package java_POO.HRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionRegularTest02 {
    public static void main(String[] args) {
        String regex = "[a-cA-C]";
        Pattern pattern = Pattern.compile(regex);

        String text = "CORINTHIANS GIGANTE";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
             System.out.println("Encontrado: '" + matcher.group() + "' começa em " + matcher.start() + " e termina em " + matcher.end());
            };
    }
}
