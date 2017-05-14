package stringProb;

import java.util.LinkedHashSet;

public class removeRepeatedCharacters {
//witout data structure
	public static String removeDuplicate(String str){
		 if(str.length()==0)
		 return "";
	boolean [] bool = new boolean[256];
	char [] ch = str.toCharArray();
	for(int i=0; i<ch.length;i++){
		if(bool[ch[i]]){
ch[i]=' ';
		}
		else
		{
			bool[ch[i]]=true;
		}
	}		 return new String(ch);
	}
	
	//with data structure
public static void removeDup(String str){
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for(int  i = 0 ;i<str.length();i++){
		set.add(str.charAt(i));
	}
	for(Character c : set){
System.out.print(c);		
	}
}
public static void main(String[] args) {
	
	System.out.println(removeDuplicate("pushpak"));
removeDup("pushpak");	
	
}	

}