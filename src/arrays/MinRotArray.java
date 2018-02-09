package my.learning.arrays;

public class MinRotArray {
  public static int pivot(int a[]) {
    int start=0,  end=a.length-1;
    
    
    if (a.length == 0 || a == null) {
      return -1;
    }

    if (a.length == 1 || a[0] <= a[end]) {
      return -1;
    }
    while (start <= end) {
      int mid = (start + end) / 2;
      // check if mid+1 is pivot
      if ( a[mid] > a[mid + 1]) {
          return mid + 1;
      } else if (a[start] <= a[mid]) {
          start = mid + 1;
      } else {
          end = mid - 1;
      }
  }
    return -1;
  }

  public static void main(String[] args) {

    int a[] = {3, 4, 5, 6, 7, 8, 1, 2};
    int key = 1;
    int min = findElement(a, 0, a.length - 1, key);
    System.out.println(min);
  }

  private static int findElement(int[] a, int i, int j, int key) {
      int pivot = pivot(a);
//    if (pivot == key) {
//      return key;
//    }
    if (pivot >0 && key >=a[0] && key <= a[pivot - 1]) {

      return findElement(a, i, pivot - 1, key);
    }

    else

      return findElement(a, pivot, a.length, key);

  }

}
