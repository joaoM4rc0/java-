package java_POO.Wcolecoes.list.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("w", "acima");
        map.put("d", "lado-direito");
        map.put("s", "abaixo");
        map.put("a", "lado-esquerdo");

        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
