package my.learning.strings;

public class ReverseRec {

  public static void main(String[] args) {
    String str ="My Name is Khan";
    int first = 0,end =str.length()-1;
    char [] charArray = str.toCharArray();
    while(end>=first) {
      char temp = charArray[first];
      charArray[first] = charArray[end];
      charArray[end] =temp;
      first++;
      end--;
    }
    System.out.println(new String(charArray));
  }
  
  
}
