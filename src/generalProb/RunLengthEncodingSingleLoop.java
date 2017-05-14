package generalProb;

public class RunLengthEncodingSingleLoop {
	
	public static String encodingLenth(String src){
		
		if(src.length()<=0)
			return "";
	StringBuffer sb = new StringBuffer();
	char prev = src.charAt(0);
	int count = 1;
	for(int i =1;i<src.length();i++){
		char curr = src.charAt(i);
		if(prev == curr){
			count ++;
		}
		else
		{
			sb.append(prev);
			sb.append(count);
			prev = curr;
			count = 1;
		}
	}
	sb.append(prev);
	sb.append(count);
	if(src.length()<=sb.length())
		return src;
	else
		return sb.toString();
}
	public static void main(String[] args) {
		
		System.out.println(encodingLenth("aaaaabbbbcccc"));
		
	}
	
}
