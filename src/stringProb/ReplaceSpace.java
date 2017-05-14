package stringProb;

public class ReplaceSpace {
	
	public static String replace(String s1) {
		int spaceCount=0;
		for(int i =0;i<s1.length();i++){
			if(s1.charAt(i)== ' ')
spaceCount++;
		}
		int newLenth = s1.length()+(3*spaceCount);
		
		char[] charsNew  = new char[newLenth];
		for(int i = s1.length()-1;i>=0;i--){
			if(s1.charAt(i)==' '){
				charsNew[newLenth-1] ='0';
				charsNew[newLenth-2] ='2';
				charsNew[newLenth-3] ='%';
				newLenth=newLenth-3;
			}
				else{
					charsNew[newLenth-1] =s1.charAt(i);
					newLenth=newLenth-1;
					
				}
			}
		return String.valueOf(charsNew);
	}

	public static void main(String args[]) {
		String s1 = "I am pushpak";
		System.out.println("Input String : " + s1);
		replace(s1);
	}

}
