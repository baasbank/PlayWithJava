import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
  public static void main(String[] args) {
    int guessedNumber;
    int randomNumber;
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    randomNumber = random.nextInt(100) + 1;
    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? \nType a number: ");
    try{
      guessedNumber = input.nextInt();
    } finally {
      input.close();
    }
    System.out.printf("Your guess is: %d\n", guessedNumber);
    System.out.printf("The number I was thinking of is: %d\n", randomNumber);
    System.out.printf("You were off by: %d\n", randomNumber - guessedNumber);
  }
}