package my.learning.arrays;

public class RotatedMinimun {

  public int findMinimum(int a[], int low, int high) {

    if (high < low)
      return a[0];
    if (high == low)
      return a[low];
    int mid = (low + high) / 2;
    if (mid < high && a[mid] < a[mid - 1])
      return a[mid];
    if (a[high] > a[mid])
      return findMinimum(a, low, mid - 1);
    return findMinimum(a, mid + 1, high);
  }

  public static void main(String[] args) {
    int a[] = {2, 3, 4, 5, 6, 7, 8, 10};
    RotatedMinimun rm = new RotatedMinimun();
    int min = rm.findMinimum(a, 0, a.length - 1);
    System.out.println(min);
  }
}


