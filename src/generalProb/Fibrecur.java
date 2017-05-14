package generalProb;

public class Fibrecur {
	
	public static  int fib(int n){
		if(n<2)
			return n;
			
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		int numb =10;
for(int i =0;i<numb;i++){
	System.out.println(Fibrecur.fib(i));
	}
	}
}
