package generalProb;

public class RunLengthEncodeing {
	
	public static String encoding(String source){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<source.length();i++){
			int count = 1;
			while(i+1<source.length()&&source.charAt(i)==source.charAt(i+1)){
				count ++;
				i++;
			}
			sb.append(count);
			sb.append(source.charAt(i));
			sb.append("!");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		String encoded =encoding("aaaabbbbccccd");
		System.out.println(encoded);
		
	}

}
