package stringProb;

public class StringReverse {
	
public static void main(String[] args) {
	
	String s ="pushpak";
//	String rev ="";
//	
//	for(int i= s.length()-1;i>=0;i--){
//		rev+=s.charAt(i);		
//	}
//	System.out.println(rev);
//			if(rev.toLowerCase().equals(s.toLowerCase())){
//				System.out.println("Palindrome");
//				return;
//			}
//			System.out.println("Not Palindrome");
			
	String Rev =StringReverse.reverse(s);
	System.out.println(Rev);
	
}

public static String reverse(String str) 
{     
	System.out.println(str);
    if ((str==null)||(str.length() <= 1) )
        return str;
    return reverse(str.substring(1)) + str.charAt(0);
}

}
