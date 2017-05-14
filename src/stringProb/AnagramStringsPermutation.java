package stringProb;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramStringsPermutation {
	
	
	//using built in
	
	static String sort(String str){
		
		char [] content = str.toCharArray();
		Arrays.sort(content);
		
		return new String(content);
	}
	
	static boolean checkAnagram(String str1, String str2){
		
		if(str1.length()!=str2.length())
			return false;
		
		return sort(str1.toLowerCase()).equals(sort(str2.toLowerCase()));
	}
	
	//using hashMap
	
	static boolean checkHashAnagram(String str1, String str2){
		int count =1;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i< str1.length();i++){
			if(!map.containsKey(str1.toLowerCase().charAt(i)))
				map.put(str1.toLowerCase().charAt(i),count);
			else
				map.put(str1.toLowerCase().charAt(i), count + 1);
				
		}
		for(int i=0;i< str2.length();i++){
			if(!map.containsKey(str2.toLowerCase().charAt(i)))
				map.put(str2.toLowerCase().charAt(i),count);
			else
				map.put(str2.toLowerCase().charAt(i), count -1);
				
		}
		
		for(Character c : map.keySet()){
			if(map.get(c)!=0)
				return false;
						
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		if(!checkAnagram("GOD", "god"))
System.out.println("Not an anagram");
		else
			System.out.println("Anagram");
		
		
		if(!checkHashAnagram("GOD", "god"))
System.out.println("Not an anagram");
		else
			System.out.println("Anagram");
		
	}

}
