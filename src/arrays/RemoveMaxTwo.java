package my.learning.arrays;

public class RemoveMaxTwo {
  public int removeDupsTwo(int[] array) {
    int prev = 1;
    int curr = 2;
    while (curr < array.length) {
      if (array[curr] == array[prev] && array[curr] == array[prev - 1]) {
        curr++;
      } else {
        prev++;
        array[prev] = array[curr];
        curr++;
      }
    }
    return prev + 1;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5};
    RemoveMaxTwo rm = new RemoveMaxTwo();
    int n = rm.removeDupsTwo(array);
    for (int i = 0; i < n; i++) {
      System.out.print(array[i]);
    }

  }
}
