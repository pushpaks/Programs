package stringProb;

import java.util.HashMap;

public class StringPerm {

	public static boolean perm(String s1,String s2){
		HashMap<Character,Integer> map = new HashMap<>();
		int count = 1;
		if(s1.length()!=s2.length())
			return true;
		for(int i =0;i<s1.length();i++){
			if(map.containsKey(s1.charAt(i)))
					map.put(s1.charAt(i),count+1);
			else
				map.put(s1.charAt(i), count);	
		}
		
		for(int i =0;i<s2.length();i++){
			if(map.containsKey(s2.charAt(i)))
					map.put(s2.charAt(i),count-1);
			else
return false;
		}
		for(Character c : map.keySet()){
			if(map.get(c)!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	System.out.println(perm("pushpak","kaphsup"));
		
	}
}
