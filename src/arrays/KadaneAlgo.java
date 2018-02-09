package my.learning.arrays;

public class KadaneAlgo {

  public int maxSum(int a[]) {
    int max_far = 0, max_end = 0;
    for (int i = 0; i < a.length; i++) {
      max_end = max_end + a[i];
      if (max_end < 0) {
        max_end = 0;
      }
      if (max_end > max_far) {
        max_far = max_end;
      }
    }
    return max_far;
  }

  public static void main(String[] args) {
    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    KadaneAlgo ka = new KadaneAlgo();
    int max = ka.maxSum(a);
    System.out.println(max);
  }

}
