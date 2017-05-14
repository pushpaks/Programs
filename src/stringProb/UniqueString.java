package stringProb;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {
	
	
	public static void main(String[] args) {
		
		if(unique("I am disco dancer dancer"))
			System.out.println("unique");
		else
			System.out.println("not unique");
		
		
	}
	
	public static boolean unique(String str){
		
		HashSet<String> unique = new HashSet<>();
		
		String[] words = str.trim().split(" ");
		
		for(int i=0 ; i<words.length;i++){
			System.out.println(words[i].toLowerCase());
		boolean elementAdded =unique.add(words[i].toLowerCase());
		if(!elementAdded)
			return false;
		}  
		return true;
	}
	
	

}
