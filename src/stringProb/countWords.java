package stringProb;

public class countWords {
	
	public static void main(String[] args) {
		
countWords("pushpak is ass")		;
		
	}
	    public static int countWords(String str)
	    {
	        int count = 1;
	        for (int i=0;i<=str.length()-1;i++)
	        {
	            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
	            {
	                count++;
	            }
	        }
System.out.println(count);
return count;
	    }
}
