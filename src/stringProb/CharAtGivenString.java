package stringProb;

public class CharAtGivenString {

	public static void main(String[] args) {
		
        // Create three strings in three different ways.
        String str1 = "Hello" ;
        str1.equals(str1);
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = "abg";

        StringBuffer stb = new StringBuffer("Hello");
       System.out.println(stb.capacity()); stb.capacity();
        
        System.out.println(str1.compareTo(str3));
        // Determine which strings are equivalent using the ==
        // operator (as compared to calling equals(), which is
        // a more expensive operation.
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println(str1.lastIndexOf("Java", 5));
//		System.out.println(str1.charAt(str1.length()));s
	System.out.println(str1.matches("J%"));	;
	}
	
	
}
