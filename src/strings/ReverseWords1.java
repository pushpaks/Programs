package my.learning.strings;

public class ReverseWords1 {

  public static void reverseWords(char[] str) {

    int i = 0;
    for (int j = 0; j < str.length; j++) {
      if (str[j] == ' ') {
        reverse(str, i, j-1);
        i = j + 1;
      }
    }
    reverse(str, i, str.length - 1);
    reverse(str, 0, str.length-1);
    System.out.println(new String(str));
  }

  private static void reverse(char[] str, int i, int j) {
    while(i<j) {
    char temp = str[i];
    str[i] = str[j];
    str[j] = temp;
    i++;
    j--;
    }
  }
public static void main(String[] args) {
  String str = "I am pushpak";
  char [] chars = str.toCharArray();
  reverseWords(chars);
  
}
  
}
