package my.learning.strings;

import java.util.regex.Pattern;

public class ReverseWords {

  public boolean validation(String str) {
    Pattern pattern = Pattern.compile("//S");
    String[] tempStr = pattern.split(str);
    if (str instanceof String) {
      if (str.length() == 0 || str == null) {
        System.out.println("String is empty");
        return false;
      }
      if (tempStr.length == 1) {
        System.out
            .println("Cannnot revsese the words, please enter the string with more than one word");
        return false;
      }
      return true;
    }
    return false;
  }

  public String reverseWords(String str) {
    StringBuilder sb = new StringBuilder();
   // Pattern pattern = Pattern.compile("//s");
   String[] strArray = str.split(" ");
    for (int i = strArray.length-1; i >= 0; --i) {
      if(!strArray[i].equals("")) {
      sb.append(strArray[i]).append(" ");
    }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    ReverseWords rw = new ReverseWords();
    String str = "My name is pushpak";
    System.out.println("After reverse-->" + rw.reverseWords(str));
  }
}
