/*/**
 * IndexOfMax
 * Write a method called indexOfMax that takes an array of integers and returns the index of the largest element.
 */
public class IndexOfMax {
  public static int indexOfMax (int[] a) {
    int maxIndex = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
    }
  /* Uncomment to test
  public static void main(String[] args) {
    int[] test = {1,2,10000,4,10000000, 200000000};
    System.out.println(indexOfMax(test));
  }
  */
}