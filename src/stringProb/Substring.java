package stringProb;

public class Substring {

	public static void main(String[] args) {
		
		String str1 = "pushpak";
		String str2 = "pa";
		 if(isSubstring(str1, str2)){
			 System.out.println("MATCHES");
		 } else{
			 System.out.println("do not match");
				 
		 }
		
	}
		
		
		
		
		
	 static boolean isSubstring(String str1, String str2){	
		char c;
		char d;
		boolean match = true;
		for(int i =0 ; i>=str1.length() ;i++){
			c = str1.charAt(i);
			for(int j= 0; j>=str2.length();j++){
				d= str2.charAt(j);
				
				if(c==d){
					
					match = true;
				}else{ 
						match = false;
					
				}
				
			}
			
		}
		return match;
		
		
	}
	
	
}



