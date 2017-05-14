package stringProb;

public class StringAnagrams {

	public static void main(String[] args) {
		String s = "pushpak";
		char[]Stringarray = StringAnagrams.stringToArray(s);
		StringAnagrams.sort(Stringarray);
	}
		
public static char[] stringToArray(String s){
	
	char[]array = new char[s.length()];
	
	for(int i=0;i<s.length();i++){
		
		array[i]=s.charAt(i);
		
	}
	for(int i=0;i<array.length;i++){
		
		System.out.println(array[i]);
		
	}
	return array;
}

public static String sort(char[] c){

	for(int i =0;i<c.length;i++){
		for(int j =0;j<c.length;j++){
			if(c[j]>c[i]){
			char temp =	c[i];
			c[i]=c[j];
			c[j]=temp;
			}
		}
	}

return c.toString();
}

		
		
		
		
		
		

	
	
}
