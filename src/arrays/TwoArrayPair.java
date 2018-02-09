package my.learning.arrays;

import java.util.HashSet;

public class TwoArrayPair {
  public static void findpair(int a[], int b[], int value) {
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      hs.add(a[i]);
    }
    for (int j = 0; j < b.length; j++) {
      if (hs.contains(value - b[j])) {
        System.out.println("Pairs are " + (value - b[j]) + " " + b[j]);
      }
    }
  }

  public static void main(String[] args) {
    int a[] = {1, 0, -4, 7, 6, 4};
    int b[] = {0 ,2, 4, -3, 2, 1};
    int x = 5;
    findpair(a, b, x);
  }
}
