package my.learning.strings;

public class ReverseString {
  
  public static void main(String[] args) {
    
    String str = "I am pushpak";
    char [] chars= str.toCharArray();
    int i=0,j=chars.length-1;
    while(i<j) {
      char temp = chars[i];
      chars[i]=chars[j];
      chars[j]= temp;
      i++;
      j--;
    }
    System.out.println(new String(chars));
  }

}
