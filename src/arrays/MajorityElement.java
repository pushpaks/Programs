package my.learning.arrays;

public class MajorityElement {

  public int findCandidate(int a[]) {
    int maj_index = 0, count = 1;
    for (int i = 1; i < a.length; i++) {
      if (a[maj_index] == a[i]) {
        count++;
      } else {
        count--;
      }
      if (count == 0) {
        maj_index = i;
        count = 1;
      }
    }
    return a[maj_index];
  }

  public boolean checkMajority(int a[], int cand) {
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      if (cand == a[i]) {
        count++;
      }
    }

    if (count > a.length / 2) {
      return true;
    }
    return false;
  }

  public boolean findMajority(int a[]) {
    int cand = findCandidate(a);
    return checkMajority(a, cand);

  }

  public static void main(String[] args) {
    int a[] = {1, 2, 2, 2, 4, 5, 5, 2, 4};
    MajorityElement me = new MajorityElement();
    if (me.findMajority(a))
      System.out.println("Majority");
    else
      System.out.println("No Majority");
  }
}
