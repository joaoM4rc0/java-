package java_POO.zbComportamento.test;

import java_POO.zbComportamento.MInterface.CarPredicate;
import java_POO.zbComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest03 {

    static List<Car> cars = List.of(new Car("azul", 2000), new Car("branco", 1997), new Car("green", 2005));
    public static void main(String[] args) {

        List<Car> greenCar = filtrandoCarro(cars, car -> car.getColor().equals("green") );
        System.out.println(greenCar);
    }

}
