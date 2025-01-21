package java_POO.zbComportamento.test;

import java_POO.zbComportamento.MInterface.CarPredicate;
import java_POO.zbComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    static List<Car> cars = List.of(new Car("azul", 2000), new Car("branco", 1997), new Car("green", 2005));
    static List<Integer> nums = List.of(5,6,7,5,2,2,54,52,8,8,8);
    public static void main(String[] args) {

        List<Car> greenCar = filter(cars, car -> car.getColor().equals("green") );
        System.out.println(greenCar);
        System.out.println(filter(nums, numeros -> numeros % 2 == 0));
        System.out.println(filter(nums, numeros -> numeros % 2 == 1));
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> list2 = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                list2.add(t);
            }
        }
        return list2;
    }
}