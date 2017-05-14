package stringProb;

public class NLengthStrings {
	public static void  stringPrint(int n,char k[],char A[]){
		if(n<=0)
			System.out.print(String.valueOf(A)+" ");
		else
			for(int i=0;i<k.length;i++){
				A[n-1]=k[i];
				stringPrint(n-1,k,A);
			}
	}
	
	public static void main(String[] args) {
		int n =4;
		String str = "ALGO";
		stringPrint(n,str.toCharArray(),new char[n]);
	}
	
}
