package java_OOP.dominio;

public class Calculadora {
  public void somaDoisNumeros() {
    System.out.println(10+10);
  } 
  public double divideNumeros (double a, double b) {
    if (a ==0 | b == 0) {
      return 0;
    }
    return a / b;
    
  }
  public double subtraiDoisNumeros (double num, double num2) {
    return num - num2;
  }
}