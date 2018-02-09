package my.learning.strings;

import java.util.LinkedHashSet;

public class RemoveDups {

  public String removeDups(String str) {
    LinkedHashSet<Character> lhs = new LinkedHashSet<>();
    StringBuilder sb = new StringBuilder();
    if (validate(str)) {
      char[] chrs = str.toCharArray();
      for (Character chr : chrs) {
        lhs.add(chr);
      }
      for (Character ch : lhs) {
        sb.append(ch);
      }
      if (str.equals(sb.toString())) {
        System.out.println("No duplicates found");
        return str;
      }
    }
    return sb.toString();
  }

  public boolean validate(String str) {
    if (str instanceof String) {
      if (str == null || str.isEmpty()) {
        System.out.println("String is empty..please pass the valid string");
        return false;
      }
      if (str.length() < 2) {
        System.out.println("String contains only one character");
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "p";
    RemoveDups rD = new RemoveDups();
    System.out.println(rD.removeDups(str));
  }
}
