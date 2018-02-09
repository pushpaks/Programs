package my.learning.arrays;

public class PrintMaxma {

  public static void printMaxima(int a[]) {
    int max = Integer.MIN_VALUE;
  //  System.out.println(max);
    for (int i = a.length - 1; i >= 0; i--) {
      if (a[i] > max) {
        max = a[i];
        System.out.println(a[i]);
       
      }
    }
  }

  public static void main(String[] args) {
    int a[] = {37, 19, 4, 27, 23};
    printMaxima(a);
  }
}
