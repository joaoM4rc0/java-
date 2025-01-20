package java_POO.zbComportamento.test;

import java_POO.zbComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    /* e se o cliente pedir para filrar por ano? vc teria que fazer mais um metodo, o que fica inviavel,
    se vc for reparar a unica parte do codgio que trocamos algo é no if, entao vamos usar a parametização, para tornar esse codigo mais flexivel
    */
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("azul", 2000), new Car("branco", 1997), new Car("green", 2003));
        System.out.println(filtrandoCarrosPorCor(cars, "green"));
    }
//    private static List<Car> filtrandoCarros(List<Car> cars) {
//        List<Car> greenCar = new ArrayList<>();
//        for (Car car : cars) {
//            if(car.getColor().equals("green")){
//                greenCar.add(car);
//            }
//        }
//        return greenCar;
//    }
    private static List<Car> filtrandoCarrosPorCor(List<Car> cars, String color) {
        List<Car> greenCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(color)){
                greenCar.add(car);
            }
        }
        return greenCar;
    }
}
