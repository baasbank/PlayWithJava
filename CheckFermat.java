import java.util.Scanner;

public class CheckFermat{

  public static void checkFermat (int a, int b, int c, int n) {
    if(a <= 2 && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))) {
      System.out.println("Holy smokes, Fermat was wrong!");
    } else {
      System.out.println("No, that doesn't work.");
    }
  }

  public static void main (String[] args) {
    int a, b, c, n;
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter a: ");
      a = input.nextInt();
      System.out.println("Enter b: ");
      b = input.nextInt();
      System.out.println("Enter c: ");
      c = input.nextInt();
      System.out.println("Enter n: ");
      n = input.nextInt();
      checkFermat(a,b,c,n);
    } finally {
      input.close();
    }
  }
}