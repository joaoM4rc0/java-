package java_POO.generics.test;

import java.util.ArrayList;
import java.util.List;
public class MetodosGenericosTest01 {
    public static void main(String[] args) {

        criarArray(88, 5, 7 );
        System.out.println(criarArray02(88, 5, 7 ));
    }
    private static <A,B,C> void criarArray(A a, B b, C c) {

        List<Object> array = new ArrayList<>();
        array.add(a);
        array.add(b);
        array.add(c);
        System.out.println(array);
    }
    private static <A,B,C> List<Object> criarArray02(A a, B b, C c) {
        List<Object> array = new ArrayList<>();
        array.add(a);
        array.add(b);
        array.add(c);
        return array;
    }

}
