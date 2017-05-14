package arrays;
public class Stockroom{
	
public static void main(String[] args) {
	 int array[][] = new int[3][3];
	 array[0][0]=1;
	 array[0][1]=2;
	 array[0][2]=3;
	 array[1][0]=4;
	 array[1][1]=5;
	 array[1][2]=6;
	 array[2][0]=7;
	 array[2][1]=8;
	 array[2][2]=9;
	 int temp = 0;
	 int row=3,col=3;
	 for(int i =0 ;i<4;i++){
		 for(int j = 0;j<4; j++){
			 //SSystem.out.print(array[i][j]);
			 temp = array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j+1]+array[i+2][j+2]+array[i+2][j+3];
		 }
		 System.out.println("");
	 }
	System.out.println(temp);
}
}
