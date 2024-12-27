package java_POO.HRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionRegularTest04 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z 0-9\\._-])+@([a-zA-z])+(\\.([a-zA-Z])+)+";
        Pattern pattern = Pattern.compile(regex);

        String text = "luffy@gmail.com anaju5556@mail.br";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
             System.out.println("Encontrado: '" + matcher.group() + "' começa em " + matcher.start() + " e termina em " + matcher.end());
            };
    }
}
