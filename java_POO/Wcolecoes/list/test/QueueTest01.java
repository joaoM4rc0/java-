package java_POO.Wcolecoes.list.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> letra = new PriorityQueue<>();
        letra.add("A");
        letra.add("B");
        letra.add("C");

        while(!letra.isEmpty()) {
            System.out.println(letra.poll());
        }
    }
}
