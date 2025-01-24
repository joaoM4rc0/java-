package java_POO.ZDStream.test;

import java.util.List;

public class StreamReduceTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10,15,10, 0, 2, 3);
        Integer somaLista = numeros.stream().reduce(0, Integer::sum);
        System.out.println(somaLista);
        // multiplica os nymeros da lista
        // eu filtrei tbm para que na multiplicação nao tenha um valor igual a zero
        Integer multiplicaValor = numeros.stream().filter(n -> !n.equals(0)).reduce(1, (x, y) -> x * y);
        System.out.println(multiplicaValor);
    }
}
