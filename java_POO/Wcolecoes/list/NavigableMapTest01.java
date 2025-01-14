package java_POO.Wcolecoes.list;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "VALOR: A");
        map.put("B", "VALOR: B");
        map.put("C", "VALOR: C");
        map.put("D", "VALOR: D");
        map.put("E", "VALOR: E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
