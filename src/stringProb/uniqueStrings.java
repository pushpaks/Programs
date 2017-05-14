package stringProb;

public class uniqueStrings {
	
	   public static void main(String[] args){
		   
		   String str="pushpak";
		   char ch;
		   int count=0;
	   while(str.length()!=0)
       {
           ch=str.charAt(0);
           int i=0;

           while(str.charAt(i)==ch)
           {
               count =count+i;
               i++;
           }

           str.substring(count);
           System.out.println(ch);
           System.out.println(count);
       }

   }
}