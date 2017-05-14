package stringProb;

import java.util.HashSet;

public class UniqueChar {
//without using data struture
	
	public static boolean uniqueCheck1(String s1){
if(s1.length()==0||s1.isEmpty())
	return true;
		boolean[] strset = new boolean[256];
		for(int i =0;i<s1.length();i++){
			
			int val = s1.toLowerCase().charAt(i);
			 if(strset[val])
				 return false;
			 strset[val]= true;
		}
		return true;
	}

//with data structure
	public static boolean uniqueCheck2(String s1){
HashSet<Character> set  = new HashSet<>();
		if(s1.length()==0||s1.isEmpty())
	return true;
for(int i = 0 ; i<s1.length();i++){
	if(!set.add(s1.toLowerCase().charAt(i)))
		return false;
}
return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(uniqueCheck1("ushpak"));
		System.out.println(uniqueCheck1("Pushak"));
		
	}
}
