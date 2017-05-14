package stringProb;
import java.util.HashMap;

public class firstNonRepitative {

	public static void main(String[] args) {
		
		String str = "pushpaks";
		
		Character firstRep =firstNonRep(str);
		
		System.out.println(firstRep);
	
	}
	
	
	public static Character firstNonRep(String str){
		HashMap<Character, Integer> nonRep = new HashMap<>();
		
		for(int i =0;i<str.toLowerCase().length();i++){
			
			char c = str.charAt(i);
			
			if(nonRep.containsKey(c)){
				
				nonRep.put(c,nonRep.get(c)+1);
					
				}else{
					
					nonRep.put(c,1);
				
			}
			
		}
		for(int i =0;i<=str.length();i++){
			
			char c = str.charAt(i);
			
			if(nonRep.get(c)==1){
			
			return c;
			}
			
		}
		
			return null;
	}
	
	
}
