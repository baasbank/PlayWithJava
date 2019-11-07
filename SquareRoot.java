/*
 * Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess using this formula:
  x1 = (x0 + a/x0)/2. 
  Write a method called squareRoot that takes a double and returns an ap- proximation of the square root of the parameter, using this technique. You should not use Math.sqrt.
 */
import java.util.Scanner;

public class SquareRoot {
  public static double squareRoot (double a) {
    double x0 = a / 2;
    double sqRoot = (x0 + (a / x0)) / 2;
    while (Math.abs(x0 - sqRoot) > 0.0001) {
      x0 = sqRoot;
      sqRoot = (x0 + (a / x0)) / 2;
    }
    return sqRoot;
  }  

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double number;
    System.out.print("Please enter the number whose square root you wish to find: ");
    try {
      number = input.nextDouble();
    } finally {
      input.close();
    }
    System.out.printf("The square root of %f is %f\n", number, squareRoot(number));
  }
}