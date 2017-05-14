package stringProb;

import java.util.HashMap;

public class repitativeChar {
	
	public static void countChar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		int count =1;
		for(int i =0 ;i<str.length();i++){
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i),count+1);
			else
				map.put(str.charAt(i),count);
		}
		for(Character c :map.keySet()){
			if(map.get(c)>1)
				System.out.println(c + "==>" +map.get(c));
		}
	}
	public static void main(String[] args) {
countChar("pushpak");		
	}

}
