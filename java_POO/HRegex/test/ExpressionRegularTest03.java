package java_POO.HRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionRegularTest03 {
    public static void main(String[] args) {
        String regex = "0[xX](0-9A-Fa-f)+ (\\s | $)";
        Pattern pattern = Pattern.compile(regex);

        String text = "484816 0x8469 0xFDBF 777";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
             System.out.println("Encontrado: '" + matcher.group() + "' começa em " + matcher.start() + " e termina em " + matcher.end());
            };
    }
}
