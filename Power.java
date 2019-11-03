/*/**
 * Write a recursive method called power that takes a double x and an integer n and returns xn.
 */
public class Power {
  public static double power(double x, int n) {
    if (n == 0) {
      return 1.0;
    }
    else {   
        return x * power(x, n - 1);
    }
  }
  
  /* Uncomment to test
  public static void main(String[] args) {
    System.out.println(power(6.0, 2));
    System.out.println(power(3.0, 3));
  }
  */
}