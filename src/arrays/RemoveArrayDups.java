package my.learning.arrays;

public class RemoveArrayDups {

  public boolean validate(int array[]) {

    if (array instanceof int[]) {
      if (array.length == 0 || array == null) {
        System.out.println("Array is empty");
        return false;
      }
      if (array.length < 2) {
        System.out.println("Array size is one, so no duplicate elements will be found");
        return false;
      }
    } else {
      System.out.println("Array is not int type, Please enter the valid integers");
      return false;
    }
    return true;
  }

  public int removeDups(int[] array) {
    if (validate(array)) {
      int j = 0;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] != array[i + 1]) {
          array[j++] = array[i];
        }
      }
      array[j++] = array[array.length - 1];
      return j;

    }
    return 0;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 7};
    RemoveArrayDups rd = new RemoveArrayDups();
    int n = rd.removeDups(array);
    System.out.println("Size" + n);
    if (n == array.length) {
      System.out.println("No duplicates found");
      return;
    }
    System.out.println("After removing duplicates");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");

    }
  }

}
