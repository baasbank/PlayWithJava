import java.util.Scanner;

public class BeerOnTheWall {
  public static void bottlesOfBeer(int initialBottles) {
    if (initialBottles == 0) {
      System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya' can't take one down, ya can't pass it around,\n'cause there ae no more bottles of beer on the wall!\n\n");
    } else {
      System.out.printf("\n%d bottle(s) of beer on the wall,\n%d bottle(s) of beer,\nya' take one down, ya' pass it around,\n%d bottle(s) of beer on the wall.\n\n", initialBottles, initialBottles, initialBottles - 1);
      bottlesOfBeer(initialBottles - 1);
    }
  }
  public static void main(String[] args) {
    int initialBottles;
    Scanner input = new Scanner(System.in);
    try {
      System.out.print("How many bottles of beer are on the wall initially? => ");
      initialBottles = input.nextInt();
      bottlesOfBeer(initialBottles);
    } finally {
      input.close();
    }

  }
}