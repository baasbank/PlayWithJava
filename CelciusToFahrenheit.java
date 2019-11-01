import java.util.Scanner;

public class CelciusToFahrenheit {
  public static void main (String[] args) {
    double tempInCelcius;
    Scanner input = new Scanner(System.in);
    try {
      System.out.print("Please enter the temperature in celcius: ");
      tempInCelcius = input.nextDouble();
      System.out.printf("%f in Celcius is %f in Fahrenheit\n", tempInCelcius, (tempInCelcius * 9 / 5) + 32);
    } finally {
      input.close();
    }
  }
}