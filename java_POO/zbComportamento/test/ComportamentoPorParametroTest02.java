package java_POO.zbComportamento.test;

import java_POO.zbComportamento.MInterface.CarPredicate;
import java_POO.zbComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    /* e se o cliente pedir para filrar por ano? vc teria que fazer mais um metodo, o que fica inviavel,
    se vc for reparar a unica parte do codgio que trocamos algo é no if, entao vamos usar a parametização, para tornar esse codigo mais flexivel
    */
    static List<Car> cars = List.of(new Car("azul", 2000), new Car("branco", 1997), new Car("green", 2005));
    public static void main(String[] args) {

        List<Car> greenCar = filtrandoCarro(cars, car -> car.getColor().equals("green") );
        System.out.println(greenCar);
//        List<Car> greenCar = filtrandoCarro(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green")
//            }
//        });
//        System.out.println(greenCar);

    }

    private static List<Car> filtrandoCarro(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
