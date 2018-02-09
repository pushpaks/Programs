package my.learning.arrays;

public class RotatedSearch {
  public int search(int a[], int key, int low, int high) {

    if (low > high)
      return -1;
    int mid = (low + high) / 2;
    if (a[mid]==key) {
      return mid;
    }

    if (a[low] <=a[mid]) {
      if (key >= a[low] && key <= a[mid])
        return search(a, key, low, mid - 1);
      else
        return search(a, key, mid + 1, high);
    }
    if (key >= a[mid] && key < a[high]) {
      return search(a, key, mid + 1, high);
    } else {
      return search(a, key, low, mid - 1);
    }
  }

  public static void main(String[] args) {
    int a[] = {3, 4, 5, 1, 2};
    RotatedSearch rs = new RotatedSearch();
    int index = rs.search(a, 5, 0, a.length - 1);
    System.out.println(index);

  }

}
