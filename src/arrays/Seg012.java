package my.learning.arrays;

public class Seg012 {

  public static void swap(int a[], int pos1, int pos2) {
    int temp = a[pos1];
    a[pos1] = a[pos2];
    a[pos2] = temp;
  }

  public static void seg012(int a[]) {
    int start = 0, end = a.length-1, j = end;
    while (j >= start) {
      if (a[j] == 0) {
        swap(a, start, j);
        start++;
      } else if (a[j] == 2) {
        swap(a, j, end);
        end--;
      } else {
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 0, 1, 0, 1, 2, 0, 2, 0, 0, 2, 1, 0, 1, 0};
    print(arr);
    seg012(arr);
    System.out.println("");
    print(arr);
  }

  private static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }

  }
}
