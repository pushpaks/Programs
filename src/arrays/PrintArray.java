package arrays;

public class PrintArray {
	
	public static void main(String[] args) {
		Integer[] arraytest = new Integer[4];
		
		
		int max=0;
		arraytest[0] = 1;
		arraytest[1] = 2;
		arraytest[2] = 3;
		arraytest[3] = 4;
		int min=	100;
		for(int array : arraytest){
			if(max < array){
max = array;				
				
			}
			
//System.out.println(array);		
		
	}
		System.out.println(max);
	}
	
}
