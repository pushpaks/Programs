package my.learning.arrays;

import java.util.HashSet;

public class PairSum {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    int a[] = {1, 2, 3, 4, 5, 6};
    int sum = 5;
    for (int i = 0; i < a.length; i++) {
      if (hs.contains(sum - a[i])) {
        System.out.println("Pairs are " + a[i] + " and  " + (sum - a[i]));
      } else {
        hs.add(a[i]);
      }

    }
  }
}
