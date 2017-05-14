package generalProb;

public class Fibonacii {
	
	public static void main(String[] args) {
		
		int[]feb =  new int[10];
		
		 feb[0]=0;
		feb[1]=1;
		for(int i=2;i<feb.length;i++){
			feb[i]=feb[i-1]+feb[i-2];
			
		}
		for(int i=0;i<feb.length;i++){
			System.out.println(feb[i]);
		}
	}
	

}
