/*/**
 * Tile
 * 1. Write a definition for a class named Tile that represents Scrabble tiles. The instance variables should include a character named letter and an integer named value.
 * 2. Write a constructor that takes parameters named letter and value and initializes the instance variables.
 * 3. Write a method named printTile that takes a Tile object as a parameter and displays the instance variables in a reader-friendly format.
 * 4. Write a method named testTile that creates a Tile object with the letter Z and the value 10, and then uses printTile to display the state of the object.
 * 5. Implement the toString and equals methods for a Tile.
 * 6. Create getters and setters for each of the attributes.
 */


 public class Tile {
   // Instance Variables
   private char letter;
   private int value;

   // Constructor
   public Tile (char letter, int value) {
     this.letter = letter;
     this.value  = value;
   }

   public void printTile (Tile anyTile) {
      System.out.printf("Letter: %c. Value: %d", this.letter, this.value);
   }

   public void testTile() {
     Tile newTile = new Tile('Z', 10);
     printTile(newTile);
   }

   public String toString() {
     return String.format("Letter: %c. Value: %d", this.letter, this.value);
   }

   public boolean equals(Tile that) {
     return this.letter == that.letter
      && this.value == that.value;
   }

   // Getter method for letter attribute
   public int getLetter() {
     return this.letter;
   }

   // Setter method for letter attribute
   public void setLetter(char letter) {
     this.letter = letter;
   } 

   // Getter method for letter attribute
  public int getValue() {
    return this.letter;
  }

  // Setter method for letter attribute
  public void setValue(char letter) {
    this.letter = letter;
  }
  /* Uncomment to test
  public static void main (String[] args) {
    Tile tiler1 = new Tile('b', 20);
    System.out.printf("Tile 1 is %s\n", tiler1);
    Tile tiler2 = tiler1;
    System.out.printf("Tile 2 is %s\n", tiler2);
    Tile tiler3 = new Tile('b', 20);
    System.out.printf("Tile 3 is %s\n", tiler3);
    System.out.printf("Is tiler 1 equal to tiler 2? \n", tiler1.equals(tiler2));
    System.out.printf("Is tiler 3 equal to tiler 1? \n", tiler3.equals(tiler1));
  }
  */
 }

